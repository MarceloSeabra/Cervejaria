/**
 * 
 */
package com.viana.cervejaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.viana.cervejaria.model.Cliente;

/**
 * @author marcelo
 *
 */
@Controller
public class ClientesController {
	
	@RequestMapping("/clientes/novo")
	private String novo(Cliente cliente) {
		return "cliente/CadastroCliente";
	}
	
	@RequestMapping(value = "/clientes/novo", method = RequestMethod.POST)
	private String cadastro(@Validated Cliente cliente, Model model,BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
			return novo(cliente);
		}
		redirectAttributes.addFlashAttribute("mensagem", "Cliente cadastrado com sucesso");
		return "redirect:/cervejas/novo";
	}
	
	@RequestMapping("clientes/cadastro")
	private String cadastrar() {
		return "cliente/CadastroCliente";
	}

}
