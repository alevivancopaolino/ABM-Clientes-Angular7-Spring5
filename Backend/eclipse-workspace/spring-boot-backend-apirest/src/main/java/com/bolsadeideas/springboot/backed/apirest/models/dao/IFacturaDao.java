package com.bolsadeideas.springboot.backed.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backed.apirest.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long> {

}
