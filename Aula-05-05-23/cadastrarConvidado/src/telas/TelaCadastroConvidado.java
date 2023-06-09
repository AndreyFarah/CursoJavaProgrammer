package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorTelaCadastroConvidado;
import repositorio.RepositorioConvidado;

public class TelaCadastroConvidado {
	
	public void menuCadastroConvidado (JFrame menuPrincipalRecebido, RepositorioConvidado repositorioConvidado) {
		
		String cpf = "Informe o CPF";
		String nome = "Digite o nome";
		String convite = "Convite VIP ou PISTA";
		String endereco = "Informe o endereço";
		String profissao = "Informe a profissao";
		String email = "Informe o Email";
		
		
		JFrame frameMenuCadastroConvidado = new JFrame();
		frameMenuCadastroConvidado.setSize(400,400);
		frameMenuCadastroConvidado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMenuCadastroConvidado.setTitle("Cadastrar Convidado");
		
		GridLayout grid = new GridLayout(0,1);
		
		JPanel panelCadastroConvidado = new JPanel();
		panelCadastroConvidado.setLayout(grid);
		
		JLabel labelCpf = new JLabel(cpf);
		panelCadastroConvidado.add(labelCpf);
		
		JTextField textCpf = new JTextField(10);
		panelCadastroConvidado.add(textCpf);
		
		JLabel labelNome = new JLabel(nome);
		panelCadastroConvidado.add(labelNome);
		
		JTextField textNome = new JTextField(10);
		panelCadastroConvidado.add(textNome);
		
		JLabel labelConvite = new JLabel(convite);
		panelCadastroConvidado.add(labelConvite);
		
		JTextField textConvite = new JTextField(10);
		panelCadastroConvidado.add(textConvite);
		
		JLabel labelEndereco = new JLabel(endereco);
		panelCadastroConvidado.add(labelEndereco);
		
		JTextField textEndereco = new JTextField(10);
		panelCadastroConvidado.add(textEndereco);
		
		JLabel labelProfissao = new JLabel(profissao);
		panelCadastroConvidado.add(labelProfissao);
		
		JTextField textProfissao = new JTextField();
		panelCadastroConvidado.add(textProfissao);
		
		JLabel labelEmail = new JLabel(email);
		panelCadastroConvidado.add(labelEmail);
		
		JTextField textEmail = new JTextField();
		panelCadastroConvidado.add(textEmail);
		
		JButton botaoEnviarCadastro = new JButton("Enviar Cadastro");
		panelCadastroConvidado.add(botaoEnviarCadastro);
		
		
		ControladorTelaCadastroConvidado controladorTelaCadastroConvidado = new ControladorTelaCadastroConvidado(textNome, textConvite, textEndereco, textProfissao, frameMenuCadastroConvidado, menuPrincipalRecebido, repositorioConvidado, textEmail, textCpf);
		botaoEnviarCadastro.addActionListener(controladorTelaCadastroConvidado);
		
		
		frameMenuCadastroConvidado.add(panelCadastroConvidado);
		frameMenuCadastroConvidado.setVisible(true);

		
		
		
		
		
		
	}

}
