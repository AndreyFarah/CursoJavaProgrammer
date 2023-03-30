
import java.util.Scanner;

public class Principal{

	public static void main(String[] args){

		//Inicializar o objeto
		
		Programador programadorUm = new Programador();
		AdmBanco admBancoUm = new AdmBanco();



		//Receber dados através do console
		Scanner entradaDados = new Scanner(System.in);

		
		//Solicitando Dados do Programador
		System.out.println("###	Cadastro Programador ###");
		System.out.println("Digite o nome do Programador");
		programadorUm.nome = entradaDados.next();
		
		System.out.println("Digite o CPF");
		programadorUm.cpf = entradaDados.next();

		System.out.println("Digite a Linguagem");
		programadorUm.linguagem = entradaDados.next();
		
		System.out.println("Nome do Programador: " + programadorUm.nome);
		System.out.println("CPF do programador: " + programadorUm.cpf);
		System.out.println("Linguagem do programador: " + programadorUm.linguagem);


		//Solicitando Dados do AdmBanco
		System.out.println("###Cadastro Adm Banco de Dados###");
		System.out.println("Digite o nome do Adm Banco de Dados");
		admBancoUm.nome = entradaDados.next();

		System.out.println("Digite o CPF");
		admBancoUm.cpf = entradaDados.next();

		System.out.println("Digite o Tipo de Banco de Dados");
		admBancoUm.tipoBanco = entradaDados.next();
			

		System.out.println("Nome do Adm Banco de dados: " + admBancoUm.nome);
		System.out.println("CPF do Adm Banco de dados: " + admBancoUm.cpf);
		System.out.println("Tipo de Banco de Dados: " + admBancoUm.tipoBanco);

		




	}





}