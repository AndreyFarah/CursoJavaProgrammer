package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Convidado;
import repositorio.RepositorioConvidado;
import validacao.ValidacaoConvidado;

public class ControladorTelaCadastroConvidado implements ActionListener{
	
		
	
		JTextField nomeRecebido;
		JTextField conviteRecebido;
		JTextField enderecoRecebido;
		JTextField profissaoRecebido;
		JFrame	frameCadastroConvidadoRecebido;
		JFrame frameMenuPrincipalRecebido;
		RepositorioConvidado repositorioJogadorRecebido;
		JTextField emailRecebido;
		JTextField cpfRecebido;
		
	
		public ControladorTelaCadastroConvidado(JTextField nomeRecebido, JTextField conviteRecebido,
				JTextField enderecoRecebido, JTextField profissaoRecebido, JFrame frameCadastroConvidadoRecebido, JFrame frameMenuPrincipalRecebido,
				RepositorioConvidado repositorioJogador, JTextField emailRecebido, JTextField textCpfRecebido) {
			
			this.nomeRecebido = nomeRecebido;
			this.conviteRecebido = conviteRecebido;
			this.enderecoRecebido = enderecoRecebido;
			this.profissaoRecebido = profissaoRecebido;
			this.frameCadastroConvidadoRecebido = frameCadastroConvidadoRecebido;
			this.frameMenuPrincipalRecebido = frameMenuPrincipalRecebido;
			this.repositorioJogadorRecebido = repositorioJogador;
			this.emailRecebido = emailRecebido;
			this.cpfRecebido = textCpfRecebido;
		}
	
		ValidacaoConvidado validacaoConvidado = new ValidacaoConvidado();
		
		boolean convidadoValidado = true;
	
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (popularConvidado()!= null) {
			
			repositorioJogadorRecebido.salvarConvidado(popularConvidado());;
			frameMenuPrincipalRecebido.setVisible(true);
			frameCadastroConvidadoRecebido.setVisible(false);
			}
		}

		public Convidado popularConvidado () {
			
			Convidado convidado = new Convidado();
			
			convidadoValidado = validacaoConvidado.validaEmail(emailRecebido.getText());
			
			if (convidadoValidado) {
				convidado.setNome(nomeRecebido.getText());
				convidado.setConvite(conviteRecebido.getText());
				convidado.setEndereco(enderecoRecebido.getText());
				convidado.setProfissao(profissaoRecebido.getText());
				convidado.setEmail(emailRecebido.getText());
				convidado.setCpf(cpfRecebido.getText());
				
				return convidado;
			} else {
				JOptionPane.showMessageDialog(null, "O email informado: " + emailRecebido.getText() + " não é valido. Por favor informe um email válido para continuar");
				return null;
			}
	
		}
		
		
		
		
}
