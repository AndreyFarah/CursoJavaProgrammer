package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorMenuCoordenador;
import controladores.ControladorMenuPrincipal;

public class MenuCoordenador {
	
	public void chamarMenuCoordenador() {
		
		String opcao1 = "1 - Cadastrar Coordenador";
		String opcao2 = "2 - Voltar";
		
		
		JFrame frameMenuCoordenador = new JFrame();
		frameMenuCoordenador.setSize(200,200);
		frameMenuCoordenador.setTitle("Menu Coordenador");
		
		JPanel panelCoordenador = new JPanel();
		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelCoordenador.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2);
		panelCoordenador.add(labelOpcao2);
		
		JTextField jtextResposta = new JTextField(10);
		panelCoordenador.add(jtextResposta);
		
		JButton botaoEnviar = new JButton("ENVIAR");
		panelCoordenador.add(botaoEnviar);
		
		ControladorMenuCoordenador controladorMenuCoordenador = new ControladorMenuCoordenador(frameMenuCoordenador, jtextResposta);
		botaoEnviar.addActionListener(controladorMenuCoordenador);
		
		
		
		frameMenuCoordenador.add(panelCoordenador);
		frameMenuCoordenador.setVisible(true);
				
		
	}	

}
