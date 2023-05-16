package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidades.Convidado;

public class ConvidadoDao {
	
	public boolean salvarConviadoBanco (Convidado convidado) {
		
		FabricaConexao fabricaConexao = new FabricaConexao();
		
		
		boolean salvar = false;
	
		String comandoSqlInsert = "insert into tabela_convidado (cpf, nome, convite, endereco, profissao, email) values (?,?,?,?,?,?)"; //COMANDO INSERT DO MYSQL COM ? NOS VALORES
		
		Connection conexaoCriada = null;
		
		PreparedStatement declaracaoComando = null;// PREPARAÇAO DO COMANDO
		
		try {
			conexaoCriada = fabricaConexao.criarConexao();
			
			declaracaoComando = (PreparedStatement)conexaoCriada.prepareStatement(comandoSqlInsert); //PREPARAÇÃO DO COMANDO RECEBE O BANCO E O COMANDO SQL
			
			declaracaoComando.setString(1, convidado.getCpf());
			declaracaoComando.setString(2, convidado.getNome());
			declaracaoComando.setString(3, convidado.getConvite());
			declaracaoComando.setString(4, convidado.getEndereco());
			declaracaoComando.setString(5, convidado.getProfissao());
			declaracaoComando.setString(6, convidado.getEmail());
			
			declaracaoComando.execute();
			
			salvar = true;
			System.out.println("Convidado Salvo com SUCESSO");
			
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Erro ao salvar");
			
			salvar = false;
			
		} finally { //EXECUTAR DEPOIS DE VERIFICAR O TRY/CATCH -- EXECUTA DANDO CERTO OU ERRADO (SEMPRE EXECUTADO)
			try {	// try para fechar a conexao
				if (conexaoCriada != null) { //verifica a conexao diferente de nula, se for está conexao aberta
					conexaoCriada.close();				
				}
				if (declaracaoComando != null) {
					declaracaoComando.close();
				}
			} catch (Exception e2) {
				System.out.println(e2);
				System.out.println("Erro ao tentar fechar conexão");
			}
		}
		
		
		return salvar;
	}
	
	
	public boolean deletarConvidadoBanco (String cpf) {
		
		FabricaConexao fabricaConexao = new FabricaConexao();
		
		boolean excluir = false;	
		
		String comandoSqlDeletar = "delete from tabela_convidado where cpf = ?";
		
		
		Connection conexaoCriada = null;
		
		PreparedStatement declaracaoComando = null;// PREPARAÇAO DO COMANDO
		
		try {
			conexaoCriada = fabricaConexao.criarConexao();
			
			declaracaoComando = (PreparedStatement)conexaoCriada.prepareStatement(comandoSqlDeletar); //PREPARAÇÃO DO COMANDO RECEBE O BANCO E O COMANDO SQL
			
			declaracaoComando.setString(1, cpf);
			
			declaracaoComando.execute();
			
			excluir = true;
			System.out.println("Convidado DELETADO com SUCESSO");
			
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Erro ao DELETAR");
			
			excluir = false;
			
		} finally { //EXECUTAR DEPOIS DE VERIFICAR O TRY/CATCH -- EXECUTA DANDO CERTO OU ERRADO (SEMPRE EXECUTADO)
			try {	// try para fechar a conexao
				if (conexaoCriada != null) { //verifica a conexao diferente de nula, se for está conexao aberta
					conexaoCriada.close();				
				}
				if (declaracaoComando != null) {
					declaracaoComando.close();
				}
			} catch (Exception e2) {
				System.out.println(e2);
				System.out.println("Erro ao tentar fechar conexão");
			}
		}
		
		return excluir;
		
	}
	
	
	public List<Convidado> buscarConvidadoBanco(){
		
		FabricaConexao fabricaConexao = new FabricaConexao();

		String comandoSqlBuscar = "select * from tabela_convidado";
		List<Convidado> listaConvidadoBanco = new ArrayList<>();
		
		Connection conexaoCriada = null;
		
		PreparedStatement declaracaoComando = null;// PREPARAÇAO DO COMANDO
		
		ResultSet resultadoTabela = null;
		
		try {
			conexaoCriada = fabricaConexao.criarConexao();
			
			declaracaoComando = (PreparedStatement)conexaoCriada.prepareStatement(comandoSqlBuscar); //PREPARAÇÃO DO COMANDO RECEBE O BANCO E O COMANDO SQL
			
			resultadoTabela = declaracaoComando.executeQuery(); //RECEBE O COMANDO EXECUTADO PELA QUERY
			
			while (resultadoTabela.next()) {
				Convidado convidado = new Convidado();
				
				convidado.setCpf(resultadoTabela.getString("cpf"));
				convidado.setNome(resultadoTabela.getString("nome"));
				convidado.setConvite(resultadoTabela.getString("convite"));
				convidado.setEndereco(resultadoTabela.getString("endereco"));
				convidado.setProfissao(resultadoTabela.getString("profissao"));
				convidado.setEmail(resultadoTabela.getString("email"));
				
				listaConvidadoBanco.add(convidado);
				
				
			}
				
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Erro ao BUSCAR NO BANCO DE DADOS");
			
			
			
		} finally { //EXECUTAR DEPOIS DE VERIFICAR O TRY/CATCH -- EXECUTA DANDO CERTO OU ERRADO (SEMPRE EXECUTADO)
			try {	// try para fechar a conexao
				if (conexaoCriada != null) { //verifica a conexao diferente de nula, se for está conexao aberta
					conexaoCriada.close();				
				}
				if (declaracaoComando != null) {
					declaracaoComando.close();
				}
			} catch (Exception e2) {
				System.out.println(e2);
				System.out.println("Erro ao tentar fechar conexão");
			}
		}
		
		
		
		
		
		
		return listaConvidadoBanco;
	}
	
	

}
