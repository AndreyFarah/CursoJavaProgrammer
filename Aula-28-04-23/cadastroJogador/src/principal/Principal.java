package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.JogadorFutebol;


public class Principal {

	public static void main(String[] args) {
				
		List<JogadorFutebol> listaJogador = new ArrayList<>();
		Scanner entradaDados = new Scanner(System.in);
	
		boolean resultado = true;
		
		
		do {
			System.out.println("1-Cadastrar 2-Sair");
			
			String resposta = entradaDados.nextLine();
			
			switch (resposta) {
				case "1" :
						JogadorFutebol jogadorRecebido = new JogadorFutebol();
						
						System.out.println("NOME DO JOGADOR");
						jogadorRecebido.setNome(entradaDados.nextLine());
						
						System.out.println("CPF JOGADOR");
						jogadorRecebido.setCpf(entradaDados.nextLine());
						
						System.out.println("IDADE DO JOGADOR");
						jogadorRecebido.setIdade(entradaDados.nextLine());
						
						System.out.println("SALARIO DO JOGADOR");
						jogadorRecebido.setSalario(Double.parseDouble(entradaDados.nextLine()));
						
						listaJogador.add(jogadorRecebido);
						
					break;
				case "2" :					
					resultado = false;
					break;
			}
			
		} while (resultado);
		
		for (JogadorFutebol jogadorItem : listaJogador) {
			System.out.println(jogadorItem.getNome());
			System.out.println(jogadorItem.getCpf());
			System.out.println(jogadorItem.getIdade());
			System.out.println(jogadorItem.getSalario());
			
			
		}

	}

}
