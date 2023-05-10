package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Convidado;
import repositorio.RepositorioConvidado;
import telas.TelaFormularioAlterarConvidado;

public class ControladorTelaAtualizarConvidado implements ActionListener{

	JFrame frameMenuPrincipalRecebido;
	JFrame	frameAtualizarRecebido;
	RepositorioConvidado repositorioConvidadoRecebido;
	JTextField textNomeRecebido;
	
	
	public ControladorTelaAtualizarConvidado(JFrame frameMenuPrincipalRecebido, JFrame frameAtualizarRecebido,
			RepositorioConvidado repositorioConvidadoRecebido, JTextField textNomeRecebido) {
		this.frameMenuPrincipalRecebido = frameMenuPrincipalRecebido;
		this.frameAtualizarRecebido = frameAtualizarRecebido;
		this.repositorioConvidadoRecebido = repositorioConvidadoRecebido;
		this.textNomeRecebido = textNomeRecebido;
	}


	TelaFormularioAlterarConvidado telaFormularioAlterarConvidado = new TelaFormularioAlterarConvidado();


	@Override
	public void actionPerformed(ActionEvent e) {

		String botaoRecebido = e.getActionCommand();
		
		if (botaoRecebido.equals("Atualizar")){
			
			Convidado convidadoAlterar = new Convidado() ;
			convidadoAlterar = repositorioConvidadoRecebido.buscarConvidado(textNomeRecebido.getText());
			
			if (convidadoAlterar != null) {
				
				
				telaFormularioAlterarConvidado.formularioAlterarConvidado(convidadoAlterar, frameMenuPrincipalRecebido, repositorioConvidadoRecebido);
				frameAtualizarRecebido.setVisible(false);
				
			} else {
				JOptionPane.showMessageDialog(null, "Não encontrado");
			}
			
		}
		if (botaoRecebido.equals("Voltar")){
			System.out.println("Apertou botao voltar");
			frameMenuPrincipalRecebido.setVisible(true);
			frameAtualizarRecebido.setVisible(false);
		}
		
	}

		
}
