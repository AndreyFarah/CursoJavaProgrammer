package servico;

import javax.swing.JOptionPane;

import entidade.Furadeira;
import entidade.Makita;

public class Servico {
	
		//CADASTRO DA FURADEIRA - SET
		public Furadeira cadastroFuradeira (Furadeira furadeiraParamentro) {
			
			furadeiraParamentro.setCodigo(JOptionPane.showInputDialog("Digite o codigo da Furadeira: "));
			furadeiraParamentro.setMarca(JOptionPane.showInputDialog("Digite a marca da Furadeira: "));
			furadeiraParamentro.setPrecoDeCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de compra da furadeira")));
			furadeiraParamentro.setPrecoDeVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de venda da furadeira")));
			
			
			return furadeiraParamentro;
		}
	
		//EXIBE FURADEIRA - GET
		public void exibeFuradeira (Furadeira furadeiraParametro) {
			
			//CALCULAR O LUCRO: VENDA - LUCRO 
			CalcularLucro calcularLucro = new CalcularLucro();
			double lucro = calcularLucro.calcularLucro(furadeiraParametro.getPrecoDeCompra(), furadeiraParametro.getPrecoDeVenda());		
			
			//EXIBE MENSAGEM DE RETORNO DA FURADEIRA
			JOptionPane.showMessageDialog(null, "Código da furadeira : " + furadeiraParametro.getCodigo());
			JOptionPane.showMessageDialog(null, "Marca da furadeira : " + furadeiraParametro.getMarca());
			JOptionPane.showMessageDialog(null, "Preço da compra da furadeira : " + furadeiraParametro.getPrecoDeCompra());
			JOptionPane.showMessageDialog(null, "Preço da venda da furadeira : " + furadeiraParametro.getPrecoDeVenda());
			JOptionPane.showMessageDialog(null, "O lucro é da furadeira foi de : " + lucro);
			
			
		}
		
		
		// CADASTRO DA MAKITA - SET
		public Makita cadastraMakita () {
			
			Makita makita = new Makita();
			
			makita.setCodigo(JOptionPane.showInputDialog("Digite o codigo da Makita :"));
			makita.setMarca(JOptionPane.showInputDialog("Digite a marca da Makita : "));
			makita.setPrecoDeCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de compra da Makita : ")));
			makita.setPrecoDeVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de venda da Makita : ")));
			
			return makita;	
		}
		
		//EXIBE O CADASTRO DA MAKITA - GET
		public void exibeMakita (Makita makitaParametro) {
			
			JOptionPane.showMessageDialog(null, "O código da Makita é : " + makitaParametro.getCodigo());
			JOptionPane.showMessageDialog(null, "Marca da Makita : " + makitaParametro.getMarca());
			JOptionPane.showMessageDialog(null, "Preço da compra da Makita : " + makitaParametro.getPrecoDeCompra());
			JOptionPane.showMessageDialog(null, "Preço da venda da Makita : " + makitaParametro.getPrecoDeVenda());
			
			//CALCULAR LUCRO DA MAKITA
			CalcularLucro lucroCalculado = new CalcularLucro();
			double lucro = lucroCalculado.calcularLucro(makitaParametro.getPrecoDeCompra(), makitaParametro.getPrecoDeVenda());
			//EXIBE O LUCRO DA MAKITA
			JOptionPane.showMessageDialog(null, "O lucro da Makita foi de : " + lucro);
			
			
		}
		
		
		
		public void menu() {
			
			int escolhaOpcao = Integer.parseInt((JOptionPane.showInputDialog("Digite 1 para Furadeira e 2 para Makita")));
			
			Furadeira furadeira = new Furadeira();
			
			if (escolhaOpcao == 1) {
				cadastroFuradeira(furadeira);
				exibeFuradeira(furadeira);
			}
			
			if (escolhaOpcao == 2) {
				exibeMakita(cadastraMakita());
			}
			
			
		}
		
		
		
		
	
}
