package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControladorTelaPrincipalCoordenacao implements ActionListener {

	JTextField textRespostaRecebida;
	JFrame frameRecebido;
	
	public ControladorTelaPrincipalCoordenacao(JTextField textResposta, JFrame frameMenuPrincipalCoordenacao) {
		this.textRespostaRecebida = textResposta;
		this.frameRecebido = frameMenuPrincipalCoordenacao;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String textoResposta = textRespostaRecebida.getText();
		
		if (textoResposta.equals("1") || textoResposta.equals("2")){
			
			switch (textoResposta) {
				case "1":
					System.out.println("acertou");
			}
			
		}
		
		
	}
	
	
	
	

}
