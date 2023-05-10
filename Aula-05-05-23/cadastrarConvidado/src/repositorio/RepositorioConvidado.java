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


		@Override
		public boolean deletarConvidado(Convidado convidado) {
			
			boolean resultado;
			
			try {
				listaConvidados.remove(convidado);
				resultado = true;
				
			} catch (Exception e) {
				resultado = false;
			}
			
			
			return resultado;
		}


		@Override
		public Convidado buscarConvidado(String nome) {
			
			for (Convidado convidadoVerificado : retornaConvidados()) {
				if(convidadoVerificado.getNome().equals(nome)) {
					
					return convidadoVerificado;
				}
			}
			return null;
		}

}
