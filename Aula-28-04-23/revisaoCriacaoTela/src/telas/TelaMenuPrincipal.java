package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorMenuPrincipal;

public class TelaMenuPrincipal {

	
	public void executarMenuPrincipal () {
		
		String opcao1 = "Digite 1 para cadastrar";
		String opcao2 = "Digite 2 para Listar";
		
		GridLayout grid = new GridLayout(0,1);
		
		JFrame frameMenuPrincipal = new JFrame();
		frameMenuPrincipal.setSize(200,250);
		frameMenuPrincipal.setTitle("Menu Principal");
		
		JPanel panelMenuPrincipa= new JPanel();
		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelMenuPrincipa.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2);
		panelMenuPrincipa.add(labelOpcao2);
		
		JTextField textResposta = new JTextField(10);
		panelMenuPrincipa.add(textResposta);
		
		JButton botaoEnviar = new JButton("Enviar");
		panelMenuPrincipa.add(botaoEnviar);
		
		ControladorMenuPrincipal controladorMenuPrincipal = new ControladorMenuPrincipal(textResposta, frameMenuPrincipal);
		botaoEnviar.addActionListener(controladorMenuPrincipal);
		
		
		
		frameMenuPrincipal.add(panelMenuPrincipa);
		frameMenuPrincipal.setVisible(true);
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
