package telas;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controlador.ControladorListarConvidado;
import entidades.Convidado;

public class TelaListarConvidado {
	
	public void listarConvidado (List<Convidado> listaConvidado, JFrame frameMenuPrincipal) {
		
		int qtdLinhas = listaConvidado.size();
		
		int posicaoLinha = 0;
		int posicaoColuna = 0;
		
		String [][] tabelaStringConvidado = new String [qtdLinhas][6];
		
		for (Convidado convidado : listaConvidado) {
			
			tabelaStringConvidado[posicaoLinha][posicaoColuna] = convidado.getCpf();
			posicaoColuna++;
			
			tabelaStringConvidado[posicaoLinha][posicaoColuna] = convidado.getNome();
			posicaoColuna++;
			
			tabelaStringConvidado[posicaoLinha][posicaoColuna] = convidado.getConvite();
			posicaoColuna++;
			
			tabelaStringConvidado[posicaoLinha][posicaoColuna] = convidado.getEndereco();
			posicaoColuna++;
			
			tabelaStringConvidado[posicaoLinha][posicaoColuna] = convidado.getProfissao();
			posicaoColuna++;
			
			tabelaStringConvidado[posicaoLinha][posicaoColuna] = convidado.getEmail();
			
			posicaoColuna = 0;
			posicaoLinha++;		
		}
		
		String nomesColunas[] = {"CPF","NOME", "CONVITE", "ENDEREÇO","PROFISSAO", "E-MAIL"};
		
		JFrame frameListarConvidado = new JFrame();
		frameListarConvidado.setSize(500,600);
		
		JTable jtableConvidado = new JTable(tabelaStringConvidado, nomesColunas);
		
		jtableConvidado.setBounds(30,40,300,300);
		JScrollPane scrollPaneListarConvidado = new JScrollPane(jtableConvidado);
		
		JPanel panelListarConvidado = new JPanel();
		panelListarConvidado.add(scrollPaneListarConvidado);
		
		JButton botaoVoltarMenuPrincipal = new JButton("Voltar Para o Menu Principal");
		panelListarConvidado.add(botaoVoltarMenuPrincipal);
		
		ControladorListarConvidado controladorListarConvidado = new ControladorListarConvidado(frameMenuPrincipal, frameListarConvidado);
		botaoVoltarMenuPrincipal.addActionListener(controladorListarConvidado);
		
		
		frameListarConvidado.add(panelListarConvidado);
		frameListarConvidado.setVisible(true);
		
		
		
		
		
	}
	
	
}
