package entidade;

public class Pessoa {
	
	private String nome;
	private int cpf;

	//GET  --- PEGA o valor da variavel da Classe Pessoa (desta classse)
	public String getNome () {
		
		return this.nome;
			
	}
	//SET - ENVIA (define) o valor recebido no Principal para variavel do método
	public void setNome (String nomeRecebido) {
		
		this.nome = nomeRecebido;
		
	}
	//GET  --- PEGA o valor da variavel da Classe Pessoa (desta classse)
	public int getCpf () {
		
		return this.cpf;
		
	}
	//SET - ENVIA (define) o valor recebido no Principal para variavel do método
	public void setCPF (int cpfRecebido) {
		
		this.cpf = cpfRecebido;
		
	}
}
