package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroPessoa {
	
	public void cadastrarPessoa () {
		
		
		String nome = "Digite o nome";
		String cpf = "Digite o cpf";
		
		
		GridLayout grid = new GridLayout(0,1);
		
		JFrame frameCadastroPessoa = new JFrame();
		frameCadastroPessoa.setSize(200,200);
		
		JPanel panelCadastroPessoa = new JPanel();
		
		JLabel labelNome = new JLabel(nome);
		panelCadastroPessoa.add(labelNome);
		
		JTextField textNome = new JTextField(10);
		panelCadastroPessoa.add(textNome);
		
		JLabel labelCpf = new JLabel(cpf);
		panelCadastroPessoa.add(labelCpf);
		
		JTextField textCpf = new JTextField(10);
		panelCadastroPessoa.add(textCpf);
		
		JButton enviarCadastro = new JButton("Enviar");
		panelCadastroPessoa.add(enviarCadastro);
		
		
		
		frameCadastroPessoa.add(panelCadastroPessoa);
		frameCadastroPessoa.setVisible(true);
		
		
		
	}
	
	
}
