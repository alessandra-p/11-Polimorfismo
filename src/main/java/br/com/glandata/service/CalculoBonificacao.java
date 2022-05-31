package br.com.glandata.service;

import br.com.glandata.polimorfismo.model.Funcionario;
import lombok.Getter;

public class CalculoBonificacao {

	@Getter
	private float somaBonificacao = 0.0f;

	public void registra(Funcionario f) {
		float bonificacao = f.getBonificacao();
		this.somaBonificacao += bonificacao; // += significa: this.somaBonificacao = this.somaBonificacao + bonificacao;
	}

	// Metodos não mais necessários por conta do
	// polimorfismo da classe Funcionario

//	public void registra(Gerente g) {
//		float bonificacao = g.getBonificacao();
//		this.somaBonificacao = this.somaBonificacao + bonificacao;
//	}
//
//	public void registra(EditorVideo e) {
//		float bonificacao = e.getBonificacao();
//		this.somaBonificacao = this.somaBonificacao + bonificacao;
//	}
//
//	public void registra(Designer d) {
//		float bonificacao = d.getBonificacao();
//		this.somaBonificacao = this.somaBonificacao + bonificacao;
//	}
}
