package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroConvidado {
	
	public void menuCadastroConvidado () {
		
		String nome = "Digite o nome";
		String convite = "Convite VIP ou PISTA";
		String endereco = "Informe o endereço";
		String profissao = "Informe a profissao";
		
		
		JFrame frameMenuCadastroConvidado = new JFrame();
		frameMenuCadastroConvidado.setSize(400,400);
		frameMenuCadastroConvidado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMenuCadastroConvidado.setTitle("Cadastrar Convidado");
		
		GridLayout grid = new GridLayout(0,1);
		
		JPanel panelCadastroConvidado = new JPanel();
		panelCadastroConvidado.setLayout(grid);
		
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
		
		JButton botaoEnviarCadastro = new JButton();
		panelCadastroConvidado.add(botaoEnviarCadastro);
		
		
		
		frameMenuCadastroConvidado.add(panelCadastroConvidado);
		frameMenuCadastroConvidado.setVisible(true);

		
		
		
		
		
		
	}

}
