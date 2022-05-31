package br.com.glandata.polimorfismo.model;

public class Designer extends Funcionario {

	@Override
	public float getBonificacao() {
		System.out.println("Chamando o método de bonificação do designer");
		return 200.00f;
	}

}
