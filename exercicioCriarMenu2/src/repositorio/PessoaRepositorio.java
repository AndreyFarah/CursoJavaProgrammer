package repositorio;

import java.util.ArrayList;
import java.util.List;

import entidades.Pessoa;

public class PessoaRepositorio implements PessoaInterface{

	List<Pessoa> listaPessoa = new ArrayList<>();
 	
	
	@Override
	public void salvar(Pessoa pessoa) {
		
		
		listaPessoa.add(pessoa);
		
	}

}
