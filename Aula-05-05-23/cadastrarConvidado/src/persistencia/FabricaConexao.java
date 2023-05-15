package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class FabricaConexao {
	
	private static String USUARIO = "root";
	private static String SENHA = 	"root";
	
	private static String BANCO_URL = "jdbc:mysql://localhost:3306/db_convidado";
	
	public static Connection criarConexao() {
		
			Connection conexao;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");//INFORMA O DRIVE QUE É UTILIZADO
			
			conexao = DriverManager.getConnection(BANCO_URL,USUARIO, SENHA);// CRIA A CONEXÃO COM O BANCO
			System.out.println("Conexao OK");
	
		} catch (Exception e) {
			System.out.println("Problema ao conectar");
			conexao = null;
		}

		return conexao;
	}
	

}
