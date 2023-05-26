package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class LogDao {
	
	public void registrarLog (String escreverLog) {
		
		FabricaConexao fabricaConexao = new FabricaConexao(); //Conexao
		
		String insertLogComando ="insert into tabela_log (escrita_log) value (?)";
		
		Connection conexao = null;
		PreparedStatement declaracaoComando = null;
		

		
		try {
			conexao = fabricaConexao.criarConexao();
			
			declaracaoComando = (PreparedStatement)conexao.prepareStatement(insertLogComando); //Adiciona a conexao e o comando que sera executado
			declaracaoComando.setString(1, escreverLog);
			
			declaracaoComando.execute();
			
		} catch (Exception e) {
			System.out.println("Erro ao registrar Log");
		}finally {
			
			try {
				
				if (conexao != null) {
					conexao.close();
				}
				
				if (declaracaoComando != null) {
					declaracaoComando.close();
				}
			} catch (Exception e2) {

				System.out.println("Erro ao fechar conexao");
			}
		}
		
		
	}
	
	
}
