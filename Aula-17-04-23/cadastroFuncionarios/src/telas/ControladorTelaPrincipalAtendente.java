package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControladorTelaPrincipalAtendente implements ActionListener{

	JTextField opcaoRecebida;
	JFrame	frameRecebidoPrincipalAtendente;
	
	public ControladorTelaPrincipalAtendente(JTextField textResposta, JFrame frameTelaPrincipalAtendente) {
		
		this.opcaoRecebida = textResposta;
		this.frameRecebidoPrincipalAtendente = frameTelaPrincipalAtendente;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		String opcaoResposta = opcaoRecebida.getText();
		
		if (opcaoResposta.equals("1") || opcaoResposta.equals("2")) {
			
				switch (opcaoResposta) {
				case "1": 
					System.out.println("Acertou de novo");
					break;
				case "2":
					System.out.println("Acertou a 2");
					break;
				}
				
			} else {
				JOptionPane.showMessageDialog(null, "Opção invalida");
			}
		}
}
