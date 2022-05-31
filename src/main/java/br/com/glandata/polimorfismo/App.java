package br.com.glandata.polimorfismo;

import br.com.glandata.polimorfismo.model.Designer;
import br.com.glandata.polimorfismo.model.EditorVideo;
import br.com.glandata.polimorfismo.model.Gerente;
import br.com.glandata.polimorfismo.service.CalculoBonificacao;

public class App {
	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setNome("Douglas");
		gerente.setSalario(2000.00f);
		System.out.println("Autenticou? " + gerente.autentica(123456));

		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setNome("Gian");
		editorVideo.setSalario(1000.00f);

		Designer designer = new Designer();
		designer.setNome("Camila");
		designer.setSalario(1200.00f);

		CalculoBonificacao calculo = new CalculoBonificacao();
		calculo.registra(gerente);
		calculo.registra(editorVideo);
		calculo.registra(designer);

		System.out.println(calculo.getSomaBonificacao());
	}
}
