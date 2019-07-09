package com.bolsadeideas.springboot.backed.apirest.models.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backed.apirest.models.dao.IUsuarioDao;
import com.bolsadeideas.springboot.backed.apirest.models.entity.Role;
import com.bolsadeideas.springboot.backed.apirest.models.entity.Usuario;

@Service
public class UsuarioService implements IUsuarioService , UserDetailsService {

	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
	
	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = usuarioDao.findByUsername(username);
		
		if(usuario == null) {
			logger.error("Error en el login: no existe el usuario '"+ username +"' en el sistema!");
			throw new UsernameNotFoundException("Error en el login: no existe el usuario '"+ username +"' en el sistema!");
		}
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
				
		for (Role rol : usuario.getRoles()){
			String nombreRol= rol.getNombre();
			authorities.add(new SimpleGrantedAuthority(nombreRol));
			logger.info("Role: "+nombreRol);
		}				
		
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.getEnabled(), true, true, true, authorities);
	}

	@Transactional(readOnly = true)
	public Usuario findByUsername(String username) {
		return usuarioDao.findByUsername(username);
	}

}
