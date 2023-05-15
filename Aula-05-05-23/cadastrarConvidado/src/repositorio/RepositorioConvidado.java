package repositorio;

import java.util.ArrayList;
import java.util.List;

import entidades.Convidado;
import persistencia.ConvidadoDao;

public class RepositorioConvidado implements InterfaceConvidado{

		List<Convidado> listaConvidados = new ArrayList<>();
		ConvidadoDao convidadoDao = new ConvidadoDao();
	
	
		@Override
		public void salvarConvidado(Convidado convidadoCadastrado) {
			//listaConvidados.add(convidadoCadastrado); ## USANDO LISTA
			convidadoDao.salvarConviadoBanco(convidadoCadastrado);
			
		}


		@Override
		public List<Convidado> retornaConvidados() {
			
			return convidadoDao.buscarConvidadoBanco();
			
			//return listaConvidados;
		}


		@Override
		public boolean deletarConvidado(Convidado convidado) {
			
			boolean resultado;
			
			resultado = convidadoDao.deletarConvidadoBanco(convidado.getNome());
		/*	 ###### PARA LISTA
			try {
				listaConvidados.remove(convidado);
				resultado = true;
				
			} catch (Exception e) {
				resultado = false;
			}
		*/	
			
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


		@Override
		public void alterarConvidado(Convidado convidadoAtual, Convidado convidadoNovo) {
			
			listaConvidados.remove(convidadoAtual);
			listaConvidados.add(convidadoNovo);
			
			
		}

}
