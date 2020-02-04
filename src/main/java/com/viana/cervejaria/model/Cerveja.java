/**
 * 
 */
package com.viana.cervejaria.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author marcelo
 *
 */
public class Cerveja {

	@NotBlank(message = "Sku é obrigatório")
	private String sku;
	@NotBlank(message = "O nome é obrigatório")
	private String nome;
	
	@Size(max = 50, min = 10,message = "Descrição é obrigatória")
	private String descricao;
	
	public Cerveja() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
