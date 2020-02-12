/**
 * 
 */
package com.viana.cervejaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.viana.cervejaria.model.Usuario;

/**
 * @author marcelo
 *
 */
@Controller
public class UsuariosController {
	
	@RequestMapping("/usuarios/novo")
	public String novo(Usuario usuario) {
		return "usuario/CadastroUsuario";
	}
	
	@RequestMapping("/usuarios/cadastro")
	public String cadastrar() {
		return "usuario/CadastroUsuario";
	}

}
