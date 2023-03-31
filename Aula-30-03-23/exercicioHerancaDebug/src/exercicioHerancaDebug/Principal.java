package exercicioHerancaDebug;


import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Inicializar os objetos
		
		Programador programadorUm = new Programador ();
		AdmBanco admBancoUm = new AdmBanco ();
		
		
		//Receber entrada de dados pelo Scanner
		Scanner entradaDados = new Scanner(System.in);
		
		//Solicitando Dados do Programador
		System.out.println("###Cadastro Programador###");
		System.out.println("Digite o nome do Programador:");
		programadorUm.nome = entradaDados.next();
		System.out.println("Digite o CPF do Programador:");
		programadorUm.cpf = entradaDados.next();
		System.out.println("Digite a linguagem do Programador:");
		programadorUm.linguagem = entradaDados.next();
		

	
		//Exibe a mensagem
		System.out.println("O nome do programador é: " + programadorUm.nome);
		System.out.println("O cpf do programador é: " + programadorUm.cpf);
		System.out.println("A linguagem do programador é: " + programadorUm.linguagem);
		
		//Solcitado Dados do DBA
		System.out.println("###Cadastro do DBA###");
		System.out.println("Digite o nome do DBA:");
		admBancoUm.nome = entradaDados.next();
		System.out.println("Digite o CPF do DBA:");
		admBancoUm.cpf = entradaDados.next();
		System.out.println("Digite o Tipo de Banco de Dados: ");
		admBancoUm.tipoBanco = entradaDados.next();
		
		
		//Exibe a mensagem
		System.out.println("O nome do DBA é: " + admBancoUm.nome);
		System.out.println("O cpf do DBA é: " + admBancoUm.cpf);
		System.out.println("O Banco de dados  é: " + admBancoUm.tipoBanco);
		
		
		
		
		
		
	}

}
