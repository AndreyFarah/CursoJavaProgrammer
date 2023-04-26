package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import telas.MenuAtendente;
import telas.MenuCoordenador;
import telas.MenuPrincipal;

public class ControladorMenuPrincipal implements ActionListener {
	
	
	JTextField textRespostaRecebidaLocal;
	JFrame menuPrincipalRecebidoLocal;
	
	//Objetos Inicializados
	MenuPrincipal menuPrincipal = new MenuPrincipal();
	MenuCoordenador menuCoordenador = new MenuCoordenador();
	MenuAtendente menuAtendente = new MenuAtendente();
	
		
	public ControladorMenuPrincipal(JTextField textRepostaRecebida, JFrame menuPrincipalRecebido) {
		this.textRespostaRecebidaLocal = textRepostaRecebida;
		this.menuPrincipalRecebidoLocal = menuPrincipalRecebido;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String resposta = textRespostaRecebidaLocal.getText();
		//System.out.println(resposta);
		
		if (resposta.equals("1") || resposta.equals("2")) {
			
			switch (resposta) {
			
				case "1":
					menuCoordenador.chamarMenuCoordenador();
					menuPrincipalRecebidoLocal.setVisible(false);
				break;
					
				case "2":
					menuAtendente.chamarMenuAtendente();
					menuPrincipalRecebidoLocal.setVisible(false);
					
				break;
			}
			
		}
		else {
			JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA");
		}
		
	}

}
