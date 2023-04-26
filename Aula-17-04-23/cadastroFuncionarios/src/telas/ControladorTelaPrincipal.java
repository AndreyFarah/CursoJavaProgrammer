package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

		//implments ACTIONLISTENER - PARA QUANDO UM BOTÃO FOR PRESSIONADO 
		
public class ControladorTelaPrincipal implements ActionListener{ 

		//INVOCA A CLASSE
		TelaPrincipalCoordenacao telaPrincipalCoordenacao = new TelaPrincipalCoordenacao();
		TelaPrincipalAtendente telaPrincipalAtendente = new TelaPrincipalAtendente();
		
	
		//OBJETOS DA CLASSE 
		JTextField jtextRespostaRecebido;
		JFrame jframeRecebidoTelaPrincipal;
	
		
		//CRIA O CONSTRUTOR E ESPERAR RECEBER OS PARAMETROS EM ( ) 
		public ControladorTelaPrincipal(JTextField jtextResposta, JFrame jframeRecebido) { 
				
			this.jtextRespostaRecebido = jtextResposta; 		//O PARAMETRO RECEBIDO EM textResposta É ATRIBUIDO NA VARIAVEL LOCAL
			this.jframeRecebidoTelaPrincipal = jframeRecebido;
		}
		
		
		//MÉTODO QUANDO O BOTÃO É PRESSIONADO 
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String textoResposta = jtextRespostaRecebido.getText(); 	// PEGA O TEXTO DO JTEXT texRespostaRecebido
			
			if (textoResposta.equals("1") || textoResposta.equals("2") || textoResposta.equals("3")) {
				
				switch (textoResposta) {
				case "1": 
						telaPrincipalCoordenacao.menuCoordenacao();	
						jframeRecebidoTelaPrincipal.setVisible(false);
						break;
						
				case "2":
						telaPrincipalAtendente.menuPrincipalAtendente();
						jframeRecebidoTelaPrincipal.setVisible(false);
						
				}
				
				
			}
			
			
		}

}
