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
		
		String nomesColunas[] = {"CPF","NOME", "CONVITE", "ENDEREÇO","PROFISSAO","E-MAIL"};
		
		JFrame frameAtualizarConvidado = new JFrame();
		frameAtualizarConvidado.setSize(500,600);
		
		JTable jtableConvidado = new JTable(tabelaStringConvidado, nomesColunas);
		
		jtableConvidado.setBounds(30,40,300,300);
		
		JPanel panelAtualizarConvidado = new JPanel();
		
		JScrollPane scrollPaneListarConvidado = new JScrollPane(jtableConvidado);
		
		JLabel labelCpf = new JLabel("Digite o CPF para Alterar");
		panelAtualizarConvidado.add(labelCpf);
		
		JTextField txtCpfAtualizar = new JTextField(10);
		panelAtualizarConvidado.add(txtCpfAtualizar);
				
		panelAtualizarConvidado.add(scrollPaneListarConvidado);
				
		JButton botaoAtualizarConvidado = new JButton("Atualizar");
		panelAtualizarConvidado.add(botaoAtualizarConvidado);
		
		frameAtualizarConvidado.add(panelAtualizarConvidado);
		frameAtualizarConvidado.setVisible(true);
		
		ControladorTelaAtualizarConvidado controladorTelaAtualizarConvidado = new ControladorTelaAtualizarConvidado(frameMenuPrincipal, frameAtualizarConvidado, repositorioConvidado, txtCpfAtualizar);
		botaoAtualizarConvidado.addActionListener(controladorTelaAtualizarConvidado);
	}
	
}
