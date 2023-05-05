package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import entidades.Jogador;

public class ControladorTelaCadastroJogador implements ActionListener{
	
	
	JTextField nomeRecebido;
	JTextField cpfRecebido;
	

	public ControladorTelaCadastroJogador(JTextField nomeRecebido, JTextField cpfRecebido) {
		this.nomeRecebido = nomeRecebido;
		this.cpfRecebido = cpfRecebido;
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("irrrrruuu");	
		
	}

	public Jogador popularJogador () {
		
		Jogador jogador = new Jogador();
		
		jogador.setNome(nomeRecebido.getText());
		jogador.setCpf(cpfRecebido.getText());
		
		return jogador;
	}
	
	
	
	
}
