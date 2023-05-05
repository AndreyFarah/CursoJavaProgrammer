package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControladorMenuPrincipal implements ActionListener {

	JTextField textRecebido;
	String textoRecebidoString;
	
	public ControladorMenuPrincipal(JTextField textRecebido) {
		super();
		this.textRecebido = textRecebido;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		textoRecebidoString = textRecebido.getText();
		
		if (textoRecebidoString.equals("1") || textoRecebidoString.equals("2") || textoRecebidoString.equals("3")){
		
				switch (textoRecebidoString) {
				case "1" :
					JOptionPane.showMessageDialog(null, "Escolheu opção A");
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
