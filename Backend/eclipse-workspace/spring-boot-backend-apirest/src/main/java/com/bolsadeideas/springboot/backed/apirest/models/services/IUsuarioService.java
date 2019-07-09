package com.bolsadeideas.springboot.backed.apirest.models.services;

import com.bolsadeideas.springboot.backed.apirest.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
