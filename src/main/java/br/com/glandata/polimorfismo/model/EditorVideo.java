package br.com.glandata.polimorfismo.model;

public class EditorVideo extends Funcionario {

	@Override
	public float getBonificacao() {
		System.out.println("Chamando o método de bonificação do editor de vídeos");
		return 100.00f;
	}

}
