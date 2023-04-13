package telas;

import javax.swing.JOptionPane;

import entidades.Furadeira;

public class TelaGrafica {

	public void menu () {
		
		int escolhaMenu = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção 1 para Furadeira 2 para Makita "));
		
	}
	
	public Furadeira cadastrarFuradeira () {
		
		Furadeira furadeira = new Furadeira();
		
		furadeira.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da furadeira")));
		
				
		return furadeira;
		
		
	}
	
}
