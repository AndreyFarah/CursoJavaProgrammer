package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Convidado;
import repositorio.RepositorioConvidado;

public class ControladorTelaDeletarConvidado implements ActionListener{

	JFrame frameMenuPrincipalRecebido;
	JFrame	frameDeletarRecebido;
	RepositorioConvidado repositorioConvidadoRecebido;
	JTextField textNomeRecebido;
	
	
	
	public ControladorTelaDeletarConvidado(JFrame frameMenuPrincipalRecebido, JFrame frameDeletarRecebido,
			RepositorioConvidado repositorioConvidado, JTextField textNomeRecebido) {
		this.frameMenuPrincipalRecebido = frameMenuPrincipalRecebido;
		this.frameDeletarRecebido = frameDeletarRecebido;
		this.repositorioConvidadoRecebido = repositorioConvidado;
		this.textNomeRecebido = textNomeRecebido;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// Convidado convidadoDelete = repositorioConvidadoRecebido.buscarConvidado(textNomeRecebido.getText());
		Convidado convidadoDelete = new Convidado();
		convidadoDelete = repositorioConvidadoRecebido.buscarConvidado(textNomeRecebido.getText());
		
		if (convidadoDelete != null) {
			repositorioConvidadoRecebido.deletarConvidado(convidadoDelete);
			JOptionPane.showMessageDialog(null, "Convidado Deletado");
			frameDeletarRecebido.setVisible(false);
			frameMenuPrincipalRecebido.setVisible(true);
		}else {
			JOptionPane.showMessageDialog(null, "Convidado não encontrado");
		}
	}

}
