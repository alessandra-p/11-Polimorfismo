package br.com.glandata.polimorfismo.model;

public class Gerente extends Funcionario {

	private Integer senha = 123456;

	@Override
	public float getBonificacao() {
		System.out.println("Chamando o método de bonificação do gerente");
		return super.getBonificacao() + super.getSalario();
	}

	public Boolean autentica(Integer senha) {
		if (this.senha.equals(senha)) {
			return true;
		} else {
			return false;
		}
	}

}
