package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import telas.TelaCadastroPessoa;

public class ControladorMenuPrincipal implements ActionListener{

	TelaCadastroPessoa telaCadastroPessoa = new TelaCadastroPessoa();
	
	JTextField textRespostaRecebida;;
	JFrame frameRecebido;
	
	
	public ControladorMenuPrincipal(JTextField textRespostaRecebida, JFrame frameRecebido) {
		this.textRespostaRecebida = textRespostaRecebida;
		this.frameRecebido = frameRecebido;
	}
	





	@Override
	public void actionPerformed(ActionEvent e) {
		
		String resposta = textRespostaRecebida.getText();
	
		if (resposta.equals("1") || resposta.equals("2")) {	
			
			switch (resposta) {
			case "1": 
				telaCadastroPessoa.cadastrarPessoa();
				frameRecebido.setVisible(false);
				break;
				
			case "2":
				System.out.println("Apertou 2");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA");
		}
		
	

	}
}