package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Convidado;
import repositorio.RepositorioConvidado;
import telas.TelaAtualizarConvidado;
import telas.TelaCadastroConvidado;
import telas.TelaDeletarConvidado;
import telas.TelaListarConvidado;

public class ControladorTelaMenuPrincipal implements ActionListener {

		//INSTACIA DE OBJETOS
		TelaCadastroConvidado telaCadastroConvidado = new TelaCadastroConvidado(); //PARA CHAMAR O MENU CADASTRO DE CONVIDADO CASO OPÇÃO 1
		TelaListarConvidado telaListarConvidado = new  TelaListarConvidado();
		TelaDeletarConvidado telaDeletarConvidado = new TelaDeletarConvidado();
		TelaAtualizarConvidado telaAtualizarConvidado = new TelaAtualizarConvidado();
		
		RepositorioConvidado repositorioConvidado = new RepositorioConvidado();
		
	
	
		//INFORMAÇÕES RECEBIDAS DA TELAMENUPRINCIPAL E ARMAZENDAS NA VARIAVEL LOCAL
		JTextField respostaMenuPrincipal;
		JFrame frameMenuPrincipal;
		
		//CONSTRUTOR PARA RECEBER AS INSFORMAÇÕES DA TELAMENUPRINCIPAL
		public ControladorTelaMenuPrincipal(JTextField respostaMenuPrincipal, JFrame frameMenuPrincipal) {
			this.respostaMenuPrincipal = respostaMenuPrincipal;
			this.frameMenuPrincipal = frameMenuPrincipal;
		}


		@Override
		public void actionPerformed(ActionEvent e) {
		
			String respostaRecebida = respostaMenuPrincipal.getText();
			
			if (respostaRecebida.equals("1") || respostaRecebida.equals("2") || respostaRecebida.equals("3") || respostaRecebida.equals("4")) {
				
				switch (respostaRecebida) {
					case "1":
						telaCadastroConvidado.menuCadastroConvidado(frameMenuPrincipal, repositorioConvidado);
						frameMenuPrincipal.setVisible(false);
						break;
					case "2":
						//listarTeste(repositorioJogador.retornaConvidados());
						telaListarConvidado.listarConvidado(repositorioConvidado.retornaConvidados(),frameMenuPrincipal );
						frameMenuPrincipal.setVisible(false);
						break;
					case "3":
						telaDeletarConvidado.deletarConvidado(repositorioConvidado.retornaConvidados(),frameMenuPrincipal, repositorioConvidado);
						frameMenuPrincipal.setVisible(false);
						break;
					case "4":
						telaAtualizarConvidado.atualizarConvidado(repositorioConvidado.retornaConvidados(), frameMenuPrincipal, repositorioConvidado);
						frameMenuPrincipal.setVisible(false);
						break;
				}
			} else {
				JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA");
			}
			
			
			
		}
		
		public void listarTeste (List<Convidado> listaConvidado) {
			
			for (Convidado convidado : listaConvidado) {
				System.out.println(convidado.getNome());
			}
			
		}
		
	

}
