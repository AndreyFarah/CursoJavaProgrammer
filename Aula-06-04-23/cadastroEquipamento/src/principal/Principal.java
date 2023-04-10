package principal;

import javax.swing.JOptionPane;

import entidade.Furadeira;
import entidade.Makita;
import servico.CalcularLucro;
import servico.Servico;

public class Principal {

	public static void main(String[] args) {
		
		
		Furadeira furadeira = new Furadeira();
		Makita makita = new Makita();
		Servico chamaServico = new Servico();
	
		int escolhaCadastro;
		
		escolhaCadastro = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção que deseja cadastrar: 1-FURADEIRA, 2-MAKITA"));
					

		
		//PERGUNTAR AO USUARIO CADASTRAR FURADEIRA DIGITE 1 OU MAKITA 2
		
		
		if (escolhaCadastro == 1) {
			
			//Chama cadastro de furadeira
			furadeira = chamaServico.cadastroFuradeira(furadeira);
			
			//Exibe o cadastro da furadeira
			chamaServico.exibeFuradeira(furadeira);
		} if (escolhaCadastro == 2) {

			//Chama cadastro da makita
			makita = chamaServico.cadastraMakita(makita);
			
			//Exibe o cadastro da makita
			chamaServico.exibeMakita(makita);
		} else {			
			JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA");
		}
		
	}

}
