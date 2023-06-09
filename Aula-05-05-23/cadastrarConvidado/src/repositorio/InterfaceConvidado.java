package repositorio;

import java.util.List;

import entidades.Convidado;

public interface InterfaceConvidado {
	
		public void salvarConvidado (Convidado convidadoCadastrado);
		public List<Convidado> retornaConvidados();
		public boolean deletarConvidado(Convidado convidado);
		public Convidado buscarConvidado(String nomeConvidado);
		public void alterarConvidado (Convidado convidadoNovo);

}
