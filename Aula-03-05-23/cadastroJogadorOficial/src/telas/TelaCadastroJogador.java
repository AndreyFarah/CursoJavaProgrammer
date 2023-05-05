package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorTelaCadastroJogador;
import controlador.ControladorTelaMenuJogador;

public class TelaCadastroJogador {
	
	public void criarTelaCadastroJogador () {
		
		String nome = "Digite o nome";
		String cpf = "Digite o cpf";
		
		JFrame frameTelaCadastroJogador = new JFrame();
		frameTelaCadastroJogador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameTelaCadastroJogador.setSize(400,250);
		
		JPanel panelTelaCadastroJogador = new JPanel();
		
		GridLayout grid = new GridLayout(0,1);
		panelTelaCadastroJogador.setLayout(grid);
		
		
		JLabel labelNome = new JLabel(nome);
		panelTelaCadastroJogador.add(labelNome);
		
		JTextField textNome = new JTextField(10);
		panelTelaCadastroJogador.add(textNome);
		
		JLabel labelCpf = new JLabel(cpf);
		panelTelaCadastroJogador.add(labelCpf);
		
		JTextField textCpf = new JTextField(10);
		panelTelaCadastroJogador.add(textCpf);
		
		JButton enviarTelaCadastroJogador = new JButton("Enviar");
		panelTelaCadastroJogador.add(enviarTelaCadastroJogador);
		
		ControladorTelaCadastroJogador controladorTelaCadastroJogador = new ControladorTelaCadastroJogador(textNome, textCpf);
		enviarTelaCadastroJogador.addActionListener(controladorTelaCadastroJogador);
		
		
		
		frameTelaCadastroJogador.add(panelTelaCadastroJogador);
		frameTelaCadastroJogador.setVisible(true);
		
		
	}

}
