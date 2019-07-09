package com.bolsadeideas.springboot.backed.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backed.apirest.models.dao.IClienteDao;
import com.bolsadeideas.springboot.backed.apirest.models.dao.IFacturaDao;
import com.bolsadeideas.springboot.backed.apirest.models.dao.IProductoDao;
import com.bolsadeideas.springboot.backed.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backed.apirest.models.entity.Factura;
import com.bolsadeideas.springboot.backed.apirest.models.entity.Producto;
import com.bolsadeideas.springboot.backed.apirest.models.entity.Region;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;

	@Autowired
	private IFacturaDao facturaDao;
	
	@Autowired
	private IProductoDao productoDao;
	
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {		
		return (List<Cliente>) clienteDao.findAll();
	}
	
	@Transactional(readOnly = true)
	public Page<Cliente> findAll(Pageable pageable) {
		return clienteDao.findAll(pageable);
	}

	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);		
	}

	@Transactional(readOnly = true)
	public List<Region> findAllRegiones() {
		return clienteDao.findAllRegiones();
	}

	@Transactional(readOnly = true)
	public Factura findFacturaById(Long id) {
		return facturaDao.findById(id).orElse(null);
	}
	
	@Transactional
	public Factura saveFactura(Factura factura) {
		return facturaDao.save(factura);
	}

	@Transactional
	public void deleteFacturaById(Long id) {
		facturaDao.deleteById(id);
	}

	@Transactional(readOnly = true)
	public List<Producto> findProductoByNombre(String term) {
		return productoDao.findByNombreContainingIgnoreCase(term);
	}

}
