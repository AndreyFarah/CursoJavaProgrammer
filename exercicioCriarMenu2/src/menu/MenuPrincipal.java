package menu;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import controlador.ControladorMenuPrincipal;

public class MenuPrincipal {

	public void chamarMenuPrincipal () {
		
		String opcao1 = "Digite 1 para Cadastrar";
		String opcao2 = "Digite 2 para Opção B";
		String opcao3 = "Digite 3 para Opção C";
		
		
		
		JFrame frameMenuPrincipal = new JFrame();
		frameMenuPrincipal.setSize(200,200);
		frameMenuPrincipal.setTitle("Menu Principal");
		
		
		
		JPanel panelMenuPrincipal = new JPanel();
		
		GridLayout grid = new GridLayout(0,1);
		panelMenuPrincipal.setLayout(grid);
		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelMenuPrincipal.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2);
		panelMenuPrincipal.add(labelOpcao2);
		
		JLabel labelOpcao3 = new JLabel(opcao3);
		panelMenuPrincipal.add(labelOpcao3);


		JTextField textResposta = new JTextField(10);
		panelMenuPrincipal.add(textResposta);
		
		JButton botaoEnviar = new JButton("ENVIAR");
		panelMenuPrincipal.add(botaoEnviar);
		
		ControladorMenuPrincipal controladorMenuPrincipal = new ControladorMenuPrincipal(textResposta, frameMenuPrincipal);
		
		botaoEnviar.addActionListener(controladorMenuPrincipal);
		
		
		
		frameMenuPrincipal.add(panelMenuPrincipal);
		frameMenuPrincipal.setVisible(true);
		
		
		
	}
	
	
}
