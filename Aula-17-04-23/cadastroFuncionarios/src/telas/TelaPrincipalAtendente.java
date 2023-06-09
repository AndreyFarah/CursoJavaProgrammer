package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaPrincipalAtendente {

	public void menuPrincipalAtendente() {
		
		String opcao1 = "Digite 1 para cadastrar Atendente";
		String opcao2 = "Digite 2 para visualizar Atendente";
		
		JFrame frameTelaPrincipalAtendente = new JFrame();
		frameTelaPrincipalAtendente.setSize(200,200);
		frameTelaPrincipalAtendente.setTitle("Menu Principal Atendente");
		
		JPanel panelTelaPrincipalAtendente = new JPanel();
		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelTelaPrincipalAtendente.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2);
		panelTelaPrincipalAtendente.add(labelOpcao2);
		
		JTextField textResposta = new JTextField(10);
		panelTelaPrincipalAtendente.add(textResposta);
		
		JButton botaoEnviar = new JButton("Enviar");
		panelTelaPrincipalAtendente.add(botaoEnviar);
		
		frameTelaPrincipalAtendente.add(panelTelaPrincipalAtendente);
		frameTelaPrincipalAtendente.setVisible(true);
		
		ControladorTelaPrincipalAtendente controladorTelaPrincipalAtendente = new ControladorTelaPrincipalAtendente(textResposta, frameTelaPrincipalAtendente);
		botaoEnviar.addActionListener(controladorTelaPrincipalAtendente);
		
		
		
		
		
	}
	
}
