package br.com.glandata.polimorfismo.model;

import lombok.Getter;
import lombok.Setter;

public class Funcionario {
	
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private float salario;
	
	public float getBonificacao() {
		return this.salario * 0.10f;
	}

}
