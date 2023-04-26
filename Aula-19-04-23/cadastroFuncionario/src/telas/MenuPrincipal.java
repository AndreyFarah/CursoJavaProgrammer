package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorMenuPrincipal;

public class MenuPrincipal {
	
	public void chamarMenuPrincipal () {
		
		String opcao1 = "1 - Menu Coordenador";
		String opcao2 = "2 - Menu Atendente";

		
		JFrame frameMenuPrincipal = new JFrame();
		frameMenuPrincipal.setSize(200,200);
		frameMenuPrincipal.setTitle("Menu Principal");
		
		JPanel panelMenuPrincipal = new JPanel();
		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelMenuPrincipal.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2);
		panelMenuPrincipal.add(labelOpcao2);
		
		JTextField jtextReposta = new JTextField(10);
		panelMenuPrincipal.add(jtextReposta);
		
		JButton botaoEnviar = new JButton("ENVIAR");
		panelMenuPrincipal.add(botaoEnviar);			
		
		ControladorMenuPrincipal contraladorMenuPrincipal = new ControladorMenuPrincipal(jtextReposta, frameMenuPrincipal );
		botaoEnviar.addActionListener(contraladorMenuPrincipal);
		
		
		
		frameMenuPrincipal.add(panelMenuPrincipal);
		frameMenuPrincipal.setVisible(true);
		
		
		
		
	}
	
}
