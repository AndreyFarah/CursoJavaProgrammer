package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import telas.MenuCadastrarCoordenador;

public class ControladorMenuCoordenador implements ActionListener{
	
	//Invocando os objetos
	MenuCadastrarCoordenador menuCadastrarCoordenador = new MenuCadastrarCoordenador();
	
	JFrame frameRecebido;
	JTextField textRecebido;
	

	public ControladorMenuCoordenador(JFrame frameRecebido, JTextField textRecebido) {
		this.frameRecebido = frameRecebido;
		this.textRecebido = textRecebido;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String resposta = textRecebido.getText();
		
		if (resposta.equals("1") || resposta.equals("2")) {
			
			switch (resposta) {
			case "1" :
				menuCadastrarCoordenador.chamarMenuCadastroCoordenador();
				frameRecebido.setVisible(false);
				break;
			case "2" :
				System.out.println("opcao 2");
				break;
			}
		}
			else {
				JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA");
			}
		
		
	}

}
