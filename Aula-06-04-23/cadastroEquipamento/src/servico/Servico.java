package servico;

import javax.swing.JOptionPane;

import entidade.Furadeira;

public class Servico {
	
		//CADASTRO DA FURADEIRA - SET
		public Furadeira cadastroFuradeira (Furadeira furadeiraParamentro) {
			
			furadeiraParamentro.setCodigo(JOptionPane.showInputDialog("Digite o codigo: "));
			furadeiraParamentro.setMarca(JOptionPane.showInputDialog("Digite a marca da Furadeira: "));
			furadeiraParamentro.setPrecoDeCompra(Integer.parseInt(JOptionPane.showInputDialog("Digite o preço de compra da furadeira")));
			furadeiraParamentro.setPrecoDeVenda(Integer.parseInt(JOptionPane.showInputDialog("Digite o preço de venda da furadeira")));
			
			
			return furadeiraParamentro;
		}
	
		//EXIBE FURADEIRA - GET
		public Furadeira exibeFuradeira (Furadeira furadeiraParametro) {
			
			//CALCULAR O LUCRO: VENDA - LUCRO 
			CalcularLucro calcularLucro = new CalcularLucro();
			double lucro = calcularLucro.calcularLucro(furadeiraParametro.getPrecoDeCompra(), furadeiraParametro.getPrecoDeVenda());		
			
			//EXIBE MENSAGEM DE RETORNO DA FURADEIRA
			JOptionPane.showMessageDialog(null, "Código da furadeira : " + furadeiraParametro.getCodigo());
			JOptionPane.showMessageDialog(null, "Marca da furadeira : " + furadeiraParametro.getMarca());
			JOptionPane.showMessageDialog(null, "Preço da compra da furadeira : " + furadeiraParametro.getPrecoDeCompra());
			JOptionPane.showMessageDialog(null, "Preço da venda da furadeira : " + furadeiraParametro.getPrecoDeVenda());
			JOptionPane.showMessageDialog(null, "O lucro é : " + lucro);
			
			return furadeiraParametro;
		}
		
		
		// CADASTRO DA MAKITA - SET
		
		
		
		//EXIBE O CADASTRO DA MAKITA - GET

	
}
