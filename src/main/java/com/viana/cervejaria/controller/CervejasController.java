/**
 * 
 */
package com.viana.cervejaria.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.viana.cervejaria.model.Cerveja;

/**
 * @author marcelo
 *
 */
@Controller
public class CervejasController {
	
	@RequestMapping("/cervejas/novo")
	public String novo(Cerveja cerveja) {
		//model.addAttribute(new Cerveja());
		return "cerveja/CadastroCerveja";
	}
	
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
			//System.out.println("Tem erro sim " + bindingResult.getFieldError().getDefaultMessage());
			
			//model.addAttribute("mensagem",bindingResult.getFieldError().getDefaultMessage());
			//model.addAttribute(cerveja);
			return novo(cerveja);
		}
		
		redirectAttributes.addFlashAttribute("mensagem","Cerveja Cadastrada com Sucesso");
		System.out.println("SKU " + cerveja.getSku());
		System.out.println("NOME " + cerveja.getNome());
		System.out.println("DESCRIÇÃO " + cerveja.getDescricao());
		return "redirect:/cervejas/novo";
	}
	
	@RequestMapping("/cervejas/cadastro")
	public String cadastro() {
		return "cerveja/cadastro-produto";
		
	}

}
