package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

		//implments ACTIONLISTENER - PARA QUANDO UM BOTÃO FOR PRESSIONADO 
		
public class ControladorTelaPrincipal implements ActionListener{ 

		//INVOCA A CLASSE
		TelaPrincipalCoordenacao telaPrincipalCoordenacao = new TelaPrincipalCoordenacao();
		
	
		//OBJETOS DA CLASSE 
		JTextField jtextRespostaRecebido;
	
		
		//CRIA O CONSTRUTOR E ESPERAR RECEBER OS PARAMETROS EM ( ) 
		public ControladorTelaPrincipal(JTextField jtextResposta) { 
				
			this.jtextRespostaRecebido = jtextResposta; 		//O PARAMETRO RECEBIDO EM textResposta É ATRIBUIDO NA VARIAVEL LOCAL
			
		}
		
		
		//MÉTODO QUANDO O BOTÃO É PRESSIONADO 
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String textoResposta = jtextRespostaRecebido.getText(); 	// PEGA O TEXTO DO JTEXT texRespostaRecebido
			
			if (textoResposta.equals("1") || textoResposta.equals("2") || textoResposta.equals("3")) {
				
				switch (textoResposta) {
				case "1": 
						telaPrincipalCoordenacao.menuCoordenacao();	
				
				}
				
				
			}
			
			
		}

}
