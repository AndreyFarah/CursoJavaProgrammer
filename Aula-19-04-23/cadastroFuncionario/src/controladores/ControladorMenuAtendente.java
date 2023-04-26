package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControladorMenuAtendente implements ActionListener {

	JFrame frameRecebidoLocal;
	JTextField textRecebidoLocal;
	
	
	public ControladorMenuAtendente (JFrame frameRecebido, JTextField textRecebido) {
		
		this.frameRecebidoLocal = frameRecebido;
		this.textRecebidoLocal = textRecebido;
				
	}	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String resposta = textRecebidoLocal.getText();
		
		if (resposta.equals("1") || (resposta.equals("2"))){
			
			switch (resposta) {
			case "1":
				System.out.println("OPÇÃO 1");
				break;
			case "2" :
				System.out.println("OPÇÃO 222");
				break;
			}
						
		} else {
			JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA");
		}
		
		
	}

}
