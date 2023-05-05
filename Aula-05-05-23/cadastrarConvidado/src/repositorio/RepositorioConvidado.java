package repositorio;

import java.util.ArrayList;
import java.util.List;

import entidades.Convidado;

public class RepositorioConvidado implements InterfaceConvidado{

		List<Convidado> listaConvidados = new ArrayList<>();
	
	
		@Override
		public void salvarConvidado(Convidado convidadoCadastrado) {
			listaConvidados.add(convidadoCadastrado);
			
		}


		@Override
		public List<Convidado> retornaConvidados() {
			return listaConvidados;
		}

}
