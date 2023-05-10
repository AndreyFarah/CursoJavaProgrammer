package telas;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controlador.ControladorListarConvidado;
import controlador.ControladorTelaDeletarConvidado;
import entidades.Convidado;
import repositorio.RepositorioConvidado;

public class TelaDeletarConvidado {
	
	public  void deletarConvidado (List<Convidado> listaConvidado, JFrame frameMenuPrincipal, RepositorioConvidado repositorioConvidado) {
		
		int qtdLinhas = listaConvidado.size();
		
		int posicaoLinha = 0;
		int posicaoColuna = 0;
		
		String [][] tabelaStringConvidado = new String [qtdLinhas][4];
		
		for (Convidado convidado : listaConvidado) {
			
			tabelaStringConvidado[posicaoLinha][posicaoColuna] = convidado.getNome();
			posicaoColuna++;
			
			tabelaStringConvidado[posicaoLinha][posicaoColuna] = convidado.getConvite();
			posicaoColuna++;
			
			tabelaStringConvidado[posicaoLinha][posicaoColuna] = convidado.getEndereco();
			posicaoColuna++;
			
			tabelaStringConvidado[posicaoLinha][posicaoColuna] = convidado.getProfissao();
			
			posicaoColuna = 0;
			posicaoLinha++;		
		}
		
		String nomesColunas[] = {"NOME", "CONVITE", "ENDEREÇO","PROFISSAO"};
		
		JFrame frameDeletarConvidado = new JFrame();
		frameDeletarConvidado.setSize(500,600);
		
		JTable jtableConvidado = new JTable(tabelaStringConvidado, nomesColunas);
		
		jtableConvidado.setBounds(30,40,300,300);
		
		JPanel panelDeletarConvidado = new JPanel();
		
		JScrollPane scrollPaneListarConvidado = new JScrollPane(jtableConvidado);
		
		JLabel labelNome = new JLabel("Digite o nome para Deletar");
		panelDeletarConvidado.add(labelNome);
		
		JTextField txtNomeDelete = new JTextField(10);
		panelDeletarConvidado.add(txtNomeDelete);
				
		panelDeletarConvidado.add(scrollPaneListarConvidado);
				
		JButton botaoDeletarConvidado = new JButton("Deletar Convidado");
		panelDeletarConvidado.add(botaoDeletarConvidado);
		
		frameDeletarConvidado.add(panelDeletarConvidado);
		frameDeletarConvidado.setVisible(true);
		
		
		ControladorTelaDeletarConvidado controladorTelaDeletarConvidado = new ControladorTelaDeletarConvidado(frameMenuPrincipal, frameDeletarConvidado, repositorioConvidado, txtNomeDelete);
		botaoDeletarConvidado.addActionListener(controladorTelaDeletarConvidado);
		
		
		
			
	}
		
	

}
