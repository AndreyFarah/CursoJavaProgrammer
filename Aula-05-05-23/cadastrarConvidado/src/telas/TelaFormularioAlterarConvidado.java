package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorTelaFormularioAlterarConvidado;
import entidades.Convidado;
import repositorio.RepositorioConvidado;

public class TelaFormularioAlterarConvidado {
	
	public void formularioAlterarConvidado (Convidado convidadoEncontrado, JFrame frameMenuPrincipal, RepositorioConvidado repositorioConvidado) {
		
		String nome = "Digite o nome";
		String convite = "Convite VIP ou PISTA";
		String endereco = "Informe o endereço";
		String profissao = "Informe a profissao";
		
		
		JFrame frameFormularioAlterarConvidado = new JFrame();
		frameFormularioAlterarConvidado.setSize(400,400);
		frameFormularioAlterarConvidado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameFormularioAlterarConvidado.setTitle("Cadastrar Convidado");
		
		GridLayout grid = new GridLayout(0,1);
		
		JPanel panelFormularioAlterarConvidado = new JPanel();
		panelFormularioAlterarConvidado.setLayout(grid);
		
		JLabel labelNome = new JLabel(nome);
		panelFormularioAlterarConvidado.add(labelNome);
		
		JTextField textNome = new JTextField(10);
		textNome.setText(convidadoEncontrado.getNome());
		panelFormularioAlterarConvidado.add(textNome);
		
		JLabel labelConvite = new JLabel(convite);
		panelFormularioAlterarConvidado.add(labelConvite);
		
		JTextField textConvite = new JTextField(10);
		textConvite.setText(convidadoEncontrado.getConvite());
		panelFormularioAlterarConvidado.add(textConvite);
		
		JLabel labelEndereco = new JLabel(endereco);
		panelFormularioAlterarConvidado.add(labelEndereco);
		
		JTextField textEndereco = new JTextField(10);
		textEndereco.setText(convidadoEncontrado.getEndereco());
		panelFormularioAlterarConvidado.add(textEndereco);
		
		JLabel labelProfissao = new JLabel(profissao);
		panelFormularioAlterarConvidado.add(labelProfissao);
		
		JTextField textProfissao = new JTextField(10);
		textProfissao.setText(convidadoEncontrado.getProfissao());
		panelFormularioAlterarConvidado.add(textProfissao);
		
		JButton botaoEnviarCadastro = new JButton("Alterar Cadastro");
		panelFormularioAlterarConvidado.add(botaoEnviarCadastro);
		
		frameFormularioAlterarConvidado.add(panelFormularioAlterarConvidado);
		frameFormularioAlterarConvidado.setVisible(true);
		
		
		ControladorTelaFormularioAlterarConvidado controladorTelaFormularioAlterarConvidado = new ControladorTelaFormularioAlterarConvidado(frameMenuPrincipal, frameFormularioAlterarConvidado, textNome, textConvite, textEndereco, textProfissao, convidadoEncontrado, repositorioConvidado);
		botaoEnviarCadastro.addActionListener(controladorTelaFormularioAlterarConvidado);
		
		
	}
		
}
