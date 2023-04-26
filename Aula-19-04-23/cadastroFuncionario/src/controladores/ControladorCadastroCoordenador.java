package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Coordenador;
import gerenciadorArquivo.ManipulaArquivo;

public class ControladorCadastroCoordenador implements ActionListener{
	
	ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
	
	
	JTextField textNomeRecebido;
	JTextField textCpfRecebido;
	JTextField textCoordenacaoRecebido;
	
	//String cpfRecebido = textCpfRecebido.getText();  // PEGAR O TEXTO DO JTEXTFIELD
	
	
	public ControladorCadastroCoordenador(JTextField textNomeRecebido, JTextField textCpfRecebido, JTextField textCoordenacaoRecebido) {		
		this.textNomeRecebido = textNomeRecebido;
		this.textCpfRecebido = textCpfRecebido;
		this.textCoordenacaoRecebido = textCoordenacaoRecebido;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		manipulaArquivo.registrarArquivoCoordenador(popularCoordenador());
		JOptionPane.showInternalMessageDialog(null, "Cadastro ok");
		
	}

	public Coordenador popularCoordenador () {
		
		//Instanciar 
		Coordenador coordenador = new Coordenador();
		
		coordenador.setNome(textNomeRecebido.getText());
		//coordenador.setCpf(cpfRecebido);						// PODERIA DECLARAR A VARIAVEL ACIMA E RECEBER O VALOR PRIMEIRO, PRA DEPOIS PASSAR
		coordenador.setCpf(textCpfRecebido.getText());
		coordenador.setCoordenacao(textCoordenacaoRecebido.getText());
		
		return coordenador;
	
	}
	
}
