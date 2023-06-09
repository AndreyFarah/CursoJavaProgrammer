package telas;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import entidade.JogadorFutebol;

public class TelaListarJogador {

	public void listarJogador (List<JogadorFutebol> listaJogador) {
		
		int qtdLinhas = listaJogador.size(); // Quantidade de linhas da Tabela
		
		String [][] tabelaString = new String [qtdLinhas][4];
		
		int posicaoColuna = 0;
		int posicaoLinha = 0;
		
		for (JogadorFutebol jogadorFutebol : listaJogador) {
			
			tabelaString[posicaoLinha][posicaoColuna] = jogadorFutebol.getNome();
			
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = jogadorFutebol.getCpf();
			
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = jogadorFutebol.getIdade();
			
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = jogadorFutebol.getSalario();
			
			posicaoColuna = 0;
			posicaoLinha++;
			
		}
		
		String nomesColunas[] = {"Nome", "CPF", "Idade", "Salario"};
		
		JFrame frameListarJogador = new JFrame();
		frameListarJogador.setSize(500,600);
		
		JTable tabelaJogador = new JTable(tabelaString, nomesColunas );
		
		tabelaJogador.setBounds(30,40,300,300);
		
		JScrollPane scrollPaneListarJogador = new JScrollPane(tabelaJogador);
		
		JPanel panelListarJogador = new JPanel();
		
		panelListarJogador.add(scrollPaneListarJogador);
		
		JButton voltarBotao = new JButton("Voltar");
		panelListarJogador.add(voltarBotao);
		
		frameListarJogador.add(panelListarJogador);
		frameListarJogador.setVisible(true);
		
		
		
		
	}
	
	
}
