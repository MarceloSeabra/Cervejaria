/**
 * 
 */
package com.viana.cervejaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.viana.cervejaria.model.Cidade;

/**
 * @author marcelo
 *
 */
@Controller
public class CidadeController {
	
	@RequestMapping("/cidades/novo")
	public String novo(Cidade cidade) {
		
		return "cidade/CadastroCidade";
		
	}

}
