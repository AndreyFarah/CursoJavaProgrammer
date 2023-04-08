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
		
		
		//Chama cadastro de furadeira
		furadeira = chamaServico.cadastroFuradeira(furadeira);
		
		//Exibe o cadastro da furadeira
		chamaServico.exibeFuradeira(furadeira);
		
	
		
		
		
		//PERGUNTAR AO USUARIO CADASTRAR FURADEIRA DIGITE 1 OU MAKITA 2
		
		
		
		
		
	}

}
