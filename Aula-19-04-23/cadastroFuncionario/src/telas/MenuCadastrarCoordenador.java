package telas;

import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorCadastroCoordenador;

public class MenuCadastrarCoordenador {
	
	public void chamarMenuCadastroCoordenador() {
		
		String opcao1 = "Digite o NOME DO COORDENADOR";
		String opcao2 = "Digite o CPF";
		String opcao3 = "Digite o COORDENAÇÃO";
		
		JFrame frameCadastrarCoordenador = new JFrame();
		frameCadastrarCoordenador.setSize(330,300);
		frameCadastrarCoordenador.setTitle("Cadastrar Coordenador");
		
		JPanel panelCadastrarCoordenador = new JPanel();
		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelCadastrarCoordenador.add(labelOpcao1);
		
		JTextField textNomeCoordenador = new JTextField(10);
		panelCadastrarCoordenador.add(textNomeCoordenador);

		JLabel labelOpcao2 = new JLabel(opcao2);
		panelCadastrarCoordenador.add(labelOpcao2);
		
		JTextField textCpfCoordenador = new JTextField(10);
		panelCadastrarCoordenador.add(textCpfCoordenador);
		
		JLabel labelOpcao3 = new JLabel(opcao3);
		panelCadastrarCoordenador.add(labelOpcao3);
		
		JTextField textCoordenacao = new JTextField(10);
		panelCadastrarCoordenador.add(textCoordenacao);
		
		JButton botaoEnviar = new JButton("ENVIAR");
		panelCadastrarCoordenador.add(botaoEnviar);
		
		
		ControladorCadastroCoordenador cadastroCoordenador = new ControladorCadastroCoordenador(textNomeCoordenador, textCpfCoordenador, textCoordenacao);
		botaoEnviar.addActionListener(cadastroCoordenador);
		
		
		

		frameCadastrarCoordenador.add(panelCadastrarCoordenador);
		frameCadastrarCoordenador.setVisible(true);
		
		
	}

}
