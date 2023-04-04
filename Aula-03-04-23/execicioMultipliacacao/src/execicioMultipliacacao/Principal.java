package execicioMultipliacacao;

import java.util.Scanner;

public class Principal {
	
	public static void main (String[] args) {
		
		
		Scanner entradaDados = new Scanner(System.in);
		
		
		double numero1;
		double numero2;
		String numeroDois;
		
		double resultado;
		
		System.out.println("--- Multipliacaçao de 2 números");
		System.out.println("Informe o Primeiro número ");
		numero1 = Integer.parseInt(entradaDados.next());
		System.out.println("Primeiro numero digitado: " + numero1);
		
		System.out.println("Informe o Segundo número");
		//numero2 = Integer.parseInt(entradaDados.next());
		
		numeroDois = entradaDados.next();
		numero2 = Integer.parseInt(numeroDois);
		System.out.println("Segundo número digitado: " + numero2);
		
		
		
		resultado = numero1 * numero2;
		
		System.out.println("O resultado da multipliacação é: " + resultado);
		
	
		
	}

}
