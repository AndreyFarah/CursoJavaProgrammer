package menu;

import java.nio.charset.CoderMalfunctionError;

import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorMenuCadastroPessoa;

public class MenuCadastroPessoa {
	
	public void cadastrarPessoa() {
		
		String nome = "Digite o nome";
		String cpf = "Digite o cpf";
		
		
		JFrame frameCadastroPessoa = new JFrame();
		frameCadastroPessoa.setSize(200,200);
		frameCadastroPessoa.setTitle("Cadastro Pessoa");
		
		JPanel panelCadastroPessoa = new JPanel();
		
		JLabel labelNome = new JLabel(nome);
		panelCadastroPessoa.add(labelNome);
		
		JTextField textNome = new JTextField(10);
		panelCadastroPessoa.add(textNome);
		
		JLabel labelCpf = new JLabel(cpf);
		panelCadastroPessoa.add(labelCpf);
		
		JTextField textCpf = new JTextField(10);
		panelCadastroPessoa.add(textCpf);
		
		JButton enviarCadastro = new JButton("Enviar Cadastro");
		panelCadastroPessoa.add(enviarCadastro);
		
		frameCadastroPessoa.add(panelCadastroPessoa);
		frameCadastroPessoa.setVisible(true);
		
		ControladorMenuCadastroPessoa controladorMenuCadastroPessoa = new ControladorMenuCadastroPessoa(textNome, textCpf);
		enviarCadastro.addActionListener(controladorMenuCadastroPessoa);
		
		
		
		
		
	}

}
