package principal;

import java.util.Scanner;
import entidade.Pessoa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa novaPessoa = new Pessoa();
		Scanner entradaDados= new Scanner(System.in);
		
		String recebeNome;
		int recebeCpf;
		
		//-----------####Cadastro de Pessoa
		System.out.println("---Cadastro de Pessoa---");
		System.out.println("Digite o nome da Pessoa");
		recebeNome = entradaDados.next();
		
		//Armazena (envia p/) a String recebeNome no set da Classe Pessoa
		novaPessoa.setNome(recebeNome);
		
		//Recebe (pega) o nome pelo método GET e exibe
		System.out.println("O nome recebido pelo get é: " + novaPessoa.getNome());
		
		//-----------####Cadastro do CPF		
		System.out.println("Digite o CPF");
		recebeCpf = Integer.parseInt(entradaDados.next());
		
		//Armazena o Int recebeCpf no Set da Classe Pessoa
		novaPessoa.setCPF(recebeCpf);
		
		//Recebe o cpf pelo método GET da Classe Pessoa e exibe
		System.out.println("O CPF recebido pelo get é : " + novaPessoa.getCpf());
		
		
		

	}

}
