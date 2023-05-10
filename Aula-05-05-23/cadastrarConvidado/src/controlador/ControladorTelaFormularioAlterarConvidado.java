package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import entidades.Convidado;
import repositorio.RepositorioConvidado;

public class ControladorTelaFormularioAlterarConvidado implements ActionListener{

	JFrame frameMenuPrincipalRecebido;
	JFrame frameFormularioAlterar;
	JTextField textNomeRecebido;
	JTextField textConviteRecebido;
	JTextField textEnderecoRecebido;
	JTextField textProfissaoRecebido;
	Convidado convidadoAtual;
	RepositorioConvidado repositorioConvidado;
	

	public ControladorTelaFormularioAlterarConvidado(JFrame frameMenuPrincipalRecebido, JFrame frameFormularioAlterar,
			JTextField textNomeRecebido, JTextField textConviteRecebido, JTextField textEnderecoRecebido,
			JTextField textProfissaoRecebido, Convidado convidadoEncontrado, RepositorioConvidado repositorioConvidado) {
		this.frameMenuPrincipalRecebido = frameMenuPrincipalRecebido;
		this.frameFormularioAlterar = frameFormularioAlterar;
		this.textNomeRecebido = textNomeRecebido;
		this.textConviteRecebido = textConviteRecebido;
		this.textEnderecoRecebido = textEnderecoRecebido;
		this.textProfissaoRecebido = textProfissaoRecebido;
		this.convidadoAtual = convidadoEncontrado;
		this.repositorioConvidado = repositorioConvidado;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		repositorioConvidado.alterarConvidado(convidadoAtual, popularConvidadoNovo());
		frameFormularioAlterar.setVisible(false);
		frameMenuPrincipalRecebido.setVisible(true);
		
		
		
	}
	
	public Convidado popularConvidadoNovo() {
		
		Convidado convidadoNovo = new Convidado();
		
		convidadoNovo.setNome(textNomeRecebido.getText());
		convidadoNovo.setConvite(textConviteRecebido.getText());
		convidadoNovo.setEndereco(textEnderecoRecebido.getText());
		convidadoNovo.setProfissao(textProfissaoRecebido.getText());
		
		return convidadoNovo;
		
	}

}
