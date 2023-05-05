package Principal;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

import entidades.Furadeira;
import telas.ParteGrafica;

public class Main {

	public static void main(String[] args) {
		
		Furadeira furadeiraVazia = new Furadeira();
		Furadeira furadeiraPreenchida = new Furadeira();
		ParteGrafica paGrafica = new ParteGrafica();
		
		
		paGrafica.cadastrarFuradeira(furadeiraVazia);

	}

}
