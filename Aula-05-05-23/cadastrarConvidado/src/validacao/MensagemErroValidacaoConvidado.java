package validacao;

import java.util.InputMismatchException;

import entidades.Convidado;

public class MensagemErroValidacaoConvidado {
	
	
	
	public String retornaMenssagemErro (Convidado convidado) {
		
		ValidaEntidade validaEntidade = new ValidaEntidade();
		
		String mensagemErro = null;
		
		if(!validaEntidade.validaEmail(convidado.getEmail())) {
			
			mensagemErro = "O email " + convidado.getEmail() + " não é valido";
			
			return mensagemErro;
		}
			
		
		if (!validaEntidade.validaCpf(convidado.getCpf())) {
			
			mensagemErro = "O cpf " + convidado.getCpf() + " não é valido";
			
			return mensagemErro;
			
		}
		
		if (!validaEntidade.validaNome(convidado.getNome())) {
			
			mensagemErro = "O nome " + convidado.getNome() + " não é válido";
			
			return mensagemErro;
		}
		
		if(!validaEntidade.verificaCpfRepetido(convidado.getCpf())) {
			
			mensagemErro = "O CPF " + convidado.getCpf() + " ja está cadastrado ";
			
			return mensagemErro;
			
		}
		
		
		
		return null;
		
	}
	
	
	
	

		
}


