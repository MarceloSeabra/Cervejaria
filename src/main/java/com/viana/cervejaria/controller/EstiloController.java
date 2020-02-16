/**
 * 
 */
package com.viana.cervejaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.viana.cervejaria.model.Estilo;

/**
 * @author marcelo
 *
 */
@Controller
public class EstiloController {
	
	@RequestMapping("/estilos/novo")
	public String novo(Estilo estilo) {
		return "estilo/CadastroEstilo";
	}
}
