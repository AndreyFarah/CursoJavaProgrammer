package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorTelaMenuPrincipal;

public class TelaMenuPrincipal {
	
	public void menuPrincipal (){
		
		String opcao1 = "Digite 1 para Cadastrar Convidado";
		String opcao2 = "Digite 2 para Listar Convidado";
		
		JFrame frameMenuPrincipal = new JFrame();
		frameMenuPrincipal.setSize(350,200);
		frameMenuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMenuPrincipal.setTitle("Cadastrar Convidado");
		
		GridLayout grid = new GridLayout(0,1);
		
		JPanel panelMenuPrincipal = new JPanel();
		panelMenuPrincipal.setLayout(grid);
		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelMenuPrincipal.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2);
		panelMenuPrincipal.add(labelOpcao2);
		
		JTextField textResposta = new JTextField(10);
		panelMenuPrincipal.add(textResposta);
		
		JButton botaoEnviarOpcao = new JButton("Enviar");
		panelMenuPrincipal.add(botaoEnviarOpcao);
		
		ControladorTelaMenuPrincipal controladorTelaMenuPrincipal = new ControladorTelaMenuPrincipal(textResposta, frameMenuPrincipal);
		botaoEnviarOpcao.addActionListener(controladorTelaMenuPrincipal);
		
		
		
		frameMenuPrincipal.add(panelMenuPrincipal);
		frameMenuPrincipal.setVisible(true);
		
		
	
		
	}

}
