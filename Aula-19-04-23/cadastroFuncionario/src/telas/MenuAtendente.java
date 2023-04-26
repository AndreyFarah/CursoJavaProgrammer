package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorMenuAtendente;

public class MenuAtendente {
	
	public void chamarMenuAtendente () {
		
		String opcao1 = "1 - Cadastrar Atendente";
		String opcao2 = "2 - Voltar";
		
		JFrame frameMenuAtendente = new JFrame();
		frameMenuAtendente.setSize(200,200);
		frameMenuAtendente.setTitle("Menu Atendente");
		
		JPanel panelMenuAtendente = new JPanel();
		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelMenuAtendente.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2);
		panelMenuAtendente.add(labelOpcao2);
		
		JTextField jtextReposta = new JTextField(10);
		panelMenuAtendente.add(jtextReposta);
		
		JButton botaoEnviar = new JButton("ENVIAR");
		panelMenuAtendente.add(botaoEnviar);
		
		ControladorMenuAtendente controladorMenuAtendente = new ControladorMenuAtendente(frameMenuAtendente,jtextReposta);
		
		botaoEnviar.addActionListener(controladorMenuAtendente);
		
		frameMenuAtendente.add(panelMenuAtendente);
		frameMenuAtendente.setVisible(true);
		
	}

}
