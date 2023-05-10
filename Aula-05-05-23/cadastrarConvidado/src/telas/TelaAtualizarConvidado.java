package telas;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controlador.ControladorTelaAtualizarConvidado;
import entidades.Convidado;
import repositorio.RepositorioConvidado;

public class TelaAtualizarConvidado {

	public void atualizarConvidado (List<Convidado> listaConvidado, JFrame frameMenuPrincipal, RepositorioConvidado repositorioConvidado) {
		
		
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
		
		JFrame frameAtualizarConvidado = new JFrame();
		frameAtualizarConvidado.setSize(500,600);
		
		JTable jtableConvidado = new JTable(tabelaStringConvidado, nomesColunas);
		
		jtableConvidado.setBounds(30,40,300,300);
		
		JPanel panelAtualizarConvidado = new JPanel();
		
		JScrollPane scrollPaneListarConvidado = new JScrollPane(jtableConvidado);
		
		JLabel labelNome = new JLabel("Digite o nome para Alterar");
		panelAtualizarConvidado.add(labelNome);
		
		JTextField txtNomeAtualizar = new JTextField(10);
		panelAtualizarConvidado.add(txtNomeAtualizar);
				
		panelAtualizarConvidado.add(scrollPaneListarConvidado);
				
		JButton botaoAtualizarConvidado = new JButton("Atualizar");
		panelAtualizarConvidado.add(botaoAtualizarConvidado);
		
		frameAtualizarConvidado.add(panelAtualizarConvidado);
		frameAtualizarConvidado.setVisible(true);
		
		ControladorTelaAtualizarConvidado controladorTelaAtualizarConvidado = new ControladorTelaAtualizarConvidado(frameMenuPrincipal, frameAtualizarConvidado, repositorioConvidado, txtNomeAtualizar);
		botaoAtualizarConvidado.addActionListener(controladorTelaAtualizarConvidado);
	}
	
}
