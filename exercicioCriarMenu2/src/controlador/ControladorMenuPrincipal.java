package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import menu.MenuCadastroPessoa;
import menu.MenuPrincipal;

public class ControladorMenuPrincipal implements ActionListener {

	MenuCadastroPessoa menuCadastroPessoa = new MenuCadastroPessoa();
	
	
	JTextField textRecebido;
	JFrame frameRecebidoMenuPrincipal;
	String textoRecebidoString;
	
	public ControladorMenuPrincipal(JTextField textRecebido, JFrame frameRecebido) {
		super();
		this.textRecebido = textRecebido;
		this.frameRecebidoMenuPrincipal = frameRecebido;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		textoRecebidoString = textRecebido.getText();
		
		if (textoRecebidoString.equals("1") || textoRecebidoString.equals("2") || textoRecebidoString.equals("3")){
		
				switch (textoRecebidoString) {
				case "1" :
					menuCadastroPessoa.cadastrarPessoa();
					frameRecebidoMenuPrincipal.setVisible(false);
					break;
				case "2" :
					JOptionPane.showMessageDialog(null, "Escolheu opção B");
					break;
				case "3" :
					JOptionPane.showMessageDialog(null, "Escolheu opção C");
					break;
				}
				
		} else {
			JOptionPane.showMessageDialog(null,"Opção INVALIDA");
		} 
	
	}
}
