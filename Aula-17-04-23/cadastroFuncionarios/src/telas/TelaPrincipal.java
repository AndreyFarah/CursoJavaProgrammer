package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaPrincipal {
	
	
	public void menuPrincipal() {
		
		String opcao1 = "Digite 1 para Coordenação";
		String opcao2 = "Digite 2 para Atendente";
		
		//CRIAR O JFRAME  - depois de tudo pronto devemos deixar o FRAME visivel
		JFrame frameMenuPrincipal = new JFrame(); 		//CRIAMOS O FRAME frameMenuPrincipal
		frameMenuPrincipal.setSize(200,200); 			//DEFINE O TAMANHO DO frameMenuPrincipal
		frameMenuPrincipal.setTitle("Menu Principal");	//DEFINE O TITULO DO frameMenuPrincipal
		
		//CRIAR JPAINEL
		JPanel panelMenuPrincipal = new JPanel();
		
		//CRIA JLABEL
		JLabel labelOpcao1 = new JLabel(opcao1);  		//CRIA A JLABEL E ATRIBUI O VALOR DA VARIAVEL opcao1
		panelMenuPrincipal.add(labelOpcao1);			//ADICIONA A JLABEL NO PAINEL
		
		JLabel labelOpcao2 = new JLabel(opcao2);		//CRIA A JLABEL E ATRIBUI O VALOR VARIAVEL opcao2
		panelMenuPrincipal.add(labelOpcao2);			//ADICIONA A JLBABEL NO PAINEL 
		
		//CRIAR JTEXT
		JTextField textOpcaoEscolhida = new JTextField(10);		//CRIA O JTEXT COM TAMANHO DO CAMPO 10
		panelMenuPrincipal.add(textOpcaoEscolhida);		//ADICIONA O JTEXT NO PAINEL
		
		
		//CRIAR JBUTTON
		JButton botaoEnviar = new JButton("Enviar");	//CRIA O BOTÃO COM O TEXTO ENVIAR 
		panelMenuPrincipal.add(botaoEnviar);
		
		//ADICIONAR O JPANEL NO JFRAME E MOSTRAR FRAME
		frameMenuPrincipal.add(panelMenuPrincipal); 	//ADICIONA JPANEL NO JFRAME
		frameMenuPrincipal.setVisible(true);			//DEFINE O JFRAME COMO VISIVEL		
		
		
		//CRIAR O CONSTRUTOR contralatelaprincipal para fazer o envio dos parametros desta classe para outra
		ControladorTelaPrincipal controlaTelaPrincipal = new ControladorTelaPrincipal(textOpcaoEscolhida, frameMenuPrincipal);
		botaoEnviar.addActionListener(controlaTelaPrincipal); // INDICA QUE O ACTION LISTER TA DENTRO DE CONTROLADORTELA PRINCIPAL EM CONTROLATELAPRINCIPAL
		
	}
	
	

}
