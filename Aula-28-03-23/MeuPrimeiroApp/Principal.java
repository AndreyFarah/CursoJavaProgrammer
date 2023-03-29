import java.util.Scanner;
class Principal{

	public static void main(String[] args){
		
		
		System.out.println("############Cadastro de Aluno###############");

		System.out.println("Digite o seu nome:");

		Scanner entradaDados = new Scanner(System.in);

		String nome = entradaDados.next();
		
		System.out.println("Digite sua idade:");
		String idade = entradaDados.next();

		System.out.println("Digite seu endereco:");
		String endereco = entradaDados.next();





		System.out.println("O nome digitado foi: ");
		System.out.println(nome);
	
		System.out.println("A idade digitada foi:");
		System.out.println(idade);
	
		System.out.println("O endereco digitado foi:");
		System.out.println(endereco);

		

		
	
		

	}


}