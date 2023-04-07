package principal;


import javax.swing.JOptionPane;

import entidade.Celular;
import entidade.Televisao;

public class Principal {

	public static void main(String[] args) {

		Celular celular = new Celular ();
		Televisao televisao = new Televisao ();
		
		String recebeModelo;
		
		recebeModelo = JOptionPane.showInputDialog("Digite o modelo:");
		
		JOptionPane.showMessageDialog(null, "O modelo digitado foi : " + recebeModelo);
		
		

	}

}
