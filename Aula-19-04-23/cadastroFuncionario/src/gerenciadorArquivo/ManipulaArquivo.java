package gerenciadorArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;

import entidades.Coordenador;

public class ManipulaArquivo {
	
	public void registrarArquivoCoordenador (Coordenador coordenador) {
		
		String enderecoArquivo = "C:\\RepositorioGitHub\\MeuRepositorio\\CursoJavaProgrammer\\Aula-19-04-23\\arquivosRegistro\\coordenador.txt";
		
		try {
			
			BufferedWriter buWrite = new BufferedWriter(new FileWriter(enderecoArquivo));
			
			buWrite.append("O nome do coordenador é: " + coordenador.getNome());
			buWrite.newLine();
			buWrite.append("O cpf do coordendor é : " + coordenador.getCpf());
			buWrite.newLine();
			buWrite.append("O gerencia do coordendor é : " + coordenador.getCoordenacao());
			
			buWrite.close();
			
		} catch (Exception e) {
			
		}
		
		
	}

}
