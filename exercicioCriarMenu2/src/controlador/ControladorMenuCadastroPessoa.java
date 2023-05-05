package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import entidades.Pessoa;
import repositorio.PessoaRepositorio;

public class ControladorMenuCadastroPessoa implements ActionListener {

	PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
	
	JTextField nomeRecebido;
	JTextField cpfRecebido;
	
	public ControladorMenuCadastroPessoa(JTextField nomeRecebido, JTextField cpfRecebido) {
		super();
		this.nomeRecebido = nomeRecebido;
		this.cpfRecebido = cpfRecebido;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		pessoaRepositorio.salvar(popularPessoa());
	}

	
	public Pessoa popularPessoa () {
		
		Pessoa pessoa = new Pessoa(null, null);
		
		pessoa.setNome(nomeRecebido.getText());
		pessoa.setCpf(cpfRecebido.getText());
		
		
		
		return pessoa;
	}
	
	
	
	
	
}
