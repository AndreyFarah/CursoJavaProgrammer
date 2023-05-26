package manipulacaoArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import entidades.Convidado;
import persistencia.LogDao;

public class LogCrudConvidado {

	public void escreverNoArquivo(Convidado convidado, String tipoAlteracao) {
		
			LogDao logDao = new LogDao();
			
			String enderecoArquivo = "C:\\RepositorioGitHub\\MeuRepositorio\\CursoJavaProgrammer\\Aula-05-05-23\\cadastrarConvidado\\log\\logConvidado.txt";
			String escrita = "";
			
			switch (tipoAlteracao) {
			case "Deletar": 
				escrita = "O convidado: " +convidado.getNome()+ " foi deletado.";	
				break;
			case "Alterar":
				escrita = "O convidado: " +convidado.getNome()+ " foi alterado.";
				break;
			case "Cadastrar":
				escrita = "O convidado: " +convidado.getNome()+ " foi cadastrado.";
				break;
			}

			
			
			try {
				
				
				BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo, true));
				buWriter.newLine(); 
				buWriter.append(escrita + "\n");
				buWriter.close();		
				System.out.println("deu bom");
				logDao.registrarLog(escrita);
				
				
			}catch (IOException mensagemErro) {
				System.out.println("Deu ruim:  " + mensagemErro);
			
			}
		
		}
	
}
