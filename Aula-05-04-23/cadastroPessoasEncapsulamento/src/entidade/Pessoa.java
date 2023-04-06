package entidade;

public class Pessoa {
	
	private String nome;
	private int cpf;

	//GET  --- Envia o valor da variavel 
	public String getNome () {
		
		return this.nome;
			
	}
	
	public void setNome (String nomeRecebido) {
		
		this.nome = nomeRecebido;
		
	}
	
	public int getCpf () {
		
		return this.cpf;
		
	}
	
	public void setCPF (int cpfRecebido) {
		
		this.cpf = cpfRecebido;
		
	}
}
