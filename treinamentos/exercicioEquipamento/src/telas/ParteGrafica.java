package telas;

import javax.swing.JOptionPane;

import entidades.Furadeira;
import servico.Calculos;

public class ParteGrafica {
	
	Calculos calcular = new Calculos();
	
	public Furadeira cadastrarFuradeira (Furadeira furadeiraParamentro) {
		
		furadeiraParamentro.setCodigo(JOptionPane.showInputDialog("Digite o codigo"));
		furadeiraParamentro.setMarca(JOptionPane.showInputDialog("Digite a marca"));
		furadeiraParamentro.setTipoBroca(JOptionPane.showInputDialog("Digite o Tipo de Broca"));
		furadeiraParamentro.setPrecoDeVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de venda")));
		furadeiraParamentro.setPrecoDeCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o prço de compra")));
		
		//CHAMA O METODO CALCULAR LUCRO
		furadeiraParamentro.setLucro(calcular.calcularLucro(furadeiraParamentro.getPrecoDeVenda(), furadeiraParamentro.getPrecoDeCompra()));
	
		return furadeiraParamentro;
	
	}
	
	

}
