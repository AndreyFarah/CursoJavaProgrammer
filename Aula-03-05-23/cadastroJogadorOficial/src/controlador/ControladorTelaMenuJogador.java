package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import telas.TelaCadastroJogador;

public class ControladorTelaMenuJogador implements ActionListener {

	TelaCadastroJogador telaCadastroJogador = new TelaCadastroJogador();
	
	JFrame frameTelaMenuPrincipal;
	JTextField respostaMenuPrincipal;
	
	
	public ControladorTelaMenuJogador(JFrame frameTelaMenuPrincipal, JTextField respostaMenuPrincipal) {
		
		this.frameTelaMenuPrincipal = frameTelaMenuPrincipal;
		this.respostaMenuPrincipal = respostaMenuPrincipal;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	
		String resposta = respostaMenuPrincipal.getText();
		
		switch (resposta) {
		case "1" :
			telaCadastroJogador.criarTelaCadastroJogador();
			frameTelaMenuPrincipal.setVisible(false);
			
			
			break;
		case "2" : 
			System.out.println("Tabela");
			break;
		}
		
	}

	
	
}
