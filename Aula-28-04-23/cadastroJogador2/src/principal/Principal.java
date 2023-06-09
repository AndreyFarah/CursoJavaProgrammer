package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.JogadorFutebol;
import telas.TelaListarJogador;


public class Principal {

	public static void main(String[] args) {
		
		TelaListarJogador telaListarJogador = new TelaListarJogador();
		Scanner entrada = new Scanner(System.in);
		
		List<JogadorFutebol> listaJogador = new ArrayList<>();
		
		String resposta = null;
		boolean result = true;
		
		
		do {
			
			System.out.println("1 Cadastrar // 2 Listar");
			resposta = entrada.nextLine();
			
			
			switch (resposta) {
			case "1": 
				
				JogadorFutebol jogadorFutebol = new JogadorFutebol();
				
				System.out.println("Digite o nome do Jogador");
				jogadorFutebol.setNome(entrada.nextLine());
				
				System.out.println("Digite o CPF do Jogador");
				jogadorFutebol.setCpf(entrada.nextLine());
				
				System.out.println("Digite a idade do Jogador");
				jogadorFutebol.setIdade(entrada.nextLine());
				
				System.out.println("Digite o salario do Jogador");
				jogadorFutebol.setSalario(entrada.nextLine());
				
				
				listaJogador.add(jogadorFutebol);
				break;
				
			case "2":
				telaListarJogador.listarJogador(listaJogador);
				//result = false;
				break;
			}
			
		} while (result);
		
		
		for (JogadorFutebol jogadorItem : listaJogador) {
			System.out.println(jogadorItem.getNome());
			System.out.println(jogadorItem.getCpf());
			System.out.println((jogadorItem.getIdade()));
			System.out.println(jogadorItem.getSalario());
			System.out.println("#########################");
		}
		
		

		
	}

}
