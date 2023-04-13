
package cadastrarConvidado;

import javax.swing.JOptionPane;

import entidades.ConvidadoVip;




public class CadastrarVip {

	public ConvidadoVip cadastrarVip() {
			
			ConvidadoVip cadastro = new ConvidadoVip();
			
			cadastro.setNome(JOptionPane.showInputDialog("Digite o nome do VIP: "));
			
			
			return cadastro;
			
		}
	
}

