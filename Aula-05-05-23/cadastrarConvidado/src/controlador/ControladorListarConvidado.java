package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ControladorListarConvidado implements ActionListener {

	
	JFrame frameMenuPrincipalRecebido;
	JFrame frameTelaListarConvidado;
		
	public ControladorListarConvidado(JFrame frameMenuPrincipalRecebido, JFrame frameTelaListarConvidado) {

		this.frameMenuPrincipalRecebido = frameMenuPrincipalRecebido;
		this.frameTelaListarConvidado = frameTelaListarConvidado;
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		frameMenuPrincipalRecebido.setVisible(true);
		frameTelaListarConvidado.setVisible(false);
		
	}

}
