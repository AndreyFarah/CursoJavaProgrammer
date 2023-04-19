package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaPrincipalCoordenacao {
	
	public void menuCoordenacao() {
		
		String opcao1 = "Digite 1 para cadastrar Coordenacao";
		String opcao2 = "Digite 2 para visualizar Coordenacao";
		
		JFrame frameMenuPrincipalCoordenacao = new JFrame();
		frameMenuPrincipalCoordenacao.setSize(200,200);
		frameMenuPrincipalCoordenacao.setTitle("Menu Principal Coordenação");
		
		JPanel panelMenuPrincipalCoordenacao = new JPanel();
		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelMenuPrincipalCoordenacao.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2);
		panelMenuPrincipalCoordenacao.add(labelOpcao2);
		
		JTextField textResposta = new JTextField(10);
		panelMenuPrincipalCoordenacao.add(textResposta);
		
		JButton botaoEnviar = new JButton("Enviar");
		panelMenuPrincipalCoordenacao.add(botaoEnviar);
		
		frameMenuPrincipalCoordenacao.add(panelMenuPrincipalCoordenacao);
		frameMenuPrincipalCoordenacao.setVisible(true);
		
		
	}


}
