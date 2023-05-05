package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorTelaMenuJogador;

public class TelaMenuJogador {
	
	
	public void telaMenuJogador () {
		
		String opcao1 = "Digite 1 para Cadastrar";
		String opcao2 = "Digite 2 para Listar";
		
		JFrame framTelaMenuJogador = new JFrame();
		framTelaMenuJogador.setSize(200,250);
		
		GridLayout grid = new  GridLayout(0,1);
		
		JPanel panelTelaMenuJogador = new JPanel();
		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelTelaMenuJogador.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2);
		panelTelaMenuJogador.add(labelOpcao2);
		
		JTextField textRespostaTelaMenuJogador = new JTextField(10);
		panelTelaMenuJogador.add(textRespostaTelaMenuJogador);
		
		JButton botaoEnviarTelaMenuJogador = new JButton("ENVIAR");
		panelTelaMenuJogador.add(botaoEnviarTelaMenuJogador);
		
		ControladorTelaMenuJogador controladorTelaMenuJogador = new ControladorTelaMenuJogador(framTelaMenuJogador, textRespostaTelaMenuJogador);
		botaoEnviarTelaMenuJogador.addActionListener(controladorTelaMenuJogador);
		
		
		
		
		framTelaMenuJogador.add(panelTelaMenuJogador);
		framTelaMenuJogador.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
