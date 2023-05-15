package principal;

import java.sql.Connection;

import javax.swing.JOptionPane;

import persistencia.FabricaConexao;
import telas.TelaMenuPrincipal;

public class Principal {

	public static void main(String[] args) {
		
		TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal();
		
		telaMenuPrincipal.menuPrincipal();

		
		
		
		
	/*
	 * SOMENTE PARA TESTAR A CONEXÃO
	 * 
	 * 	FabricaConexao fabricaConexao = new FabricaConexao();
		
		Connection conexaoRecebida = fabricaConexao.criarConexao();
		
		
		if(conexaoRecebida != null) {
			JOptionPane.showMessageDialog(null, "deu bom");
		}
		if (conexaoRecebida == null){
			JOptionPane.showMessageDialog(null, "DEU RUIM");
		}
		
		
	*/
	}

}
