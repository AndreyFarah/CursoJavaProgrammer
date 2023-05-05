package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import entidades.Convidado;
import repositorio.RepositorioConvidado;

public class ControladorTelaCadastroConvidado implements ActionListener{
	
		
	
		JTextField nomeRecebido;
		JTextField conviteRecebido;
		JTextField enderecoRecebido;
		JTextField profissaoRecebido;
		JFrame	frameCadastroConvidadoRecebido;
		JFrame frameMenuPrincipalRecebido;
		RepositorioConvidado repositorioJogadorRecebido;
		
	
		public ControladorTelaCadastroConvidado(JTextField nomeRecebido, JTextField conviteRecebido,
				JTextField enderecoRecebido, JTextField profissaoRecebido, JFrame frameCadastroConvidadoRecebido, JFrame frameMenuPrincipalRecebido,
				RepositorioConvidado repositorioJogador) {
			
			this.nomeRecebido = nomeRecebido;
			this.conviteRecebido = conviteRecebido;
			this.enderecoRecebido = enderecoRecebido;
			this.profissaoRecebido = profissaoRecebido;
			this.frameCadastroConvidadoRecebido = frameCadastroConvidadoRecebido;
			this.frameMenuPrincipalRecebido = frameMenuPrincipalRecebido;
			this.repositorioJogadorRecebido = repositorioJogador;
		}
	
	
		@Override
		public void actionPerformed(ActionEvent e) {
			repositorioJogadorRecebido.salvarConvidado(popularConvidado());;
			frameMenuPrincipalRecebido.setVisible(true);
			frameCadastroConvidadoRecebido.setVisible(false);
			
		}

		public Convidado popularConvidado () {
			
			Convidado convidado = new Convidado();
			
			convidado.setNome(nomeRecebido.getText());
			convidado.setConvite(conviteRecebido.getText());
			convidado.setEndereco(enderecoRecebido.getText());
			convidado.setProfissao(profissaoRecebido.getText());
			

			return convidado;
		}
		
		
		
		
}
