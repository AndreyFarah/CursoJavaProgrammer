package telas;

import javax.swing.JOptionPane;

import cadastrarConvidado.CadastrarVip;
//import entidades.ConvidadoVip;

public class Telas {
	
	public void telaMenu () {
		
		int opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Cadastrar VIP, e 2 para Cadastrar NORMAL"));
		CadastrarVip cadastroVip = new CadastrarVip();	
		
		
		if (opcaoMenu == 1) {
			cadastroVip.cadastrarVip();		
			
			
			
		}
		
	}
	
	
	
	
	

}
