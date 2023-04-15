package arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import entidades.Aluno;
import entidades.Coordernador;
import entidades.Professor;

public class RegistrarArquivo {
	
	
	public void registrarAluno (Aluno al) {
		
			String enderecoArquivo = "C:\\RepositorioGitHub\\MeuRepositorio\\CursoJavaProgrammer\\Aula-12-04-23\\arquivoEscolar\\aluno.txt";
		
			
			
			try {
				
				BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo));
				
				buWriter.append(al.getNome());
				buWriter.newLine();
				buWriter.append(Integer.toString(al.getMatricula()));
				buWriter.newLine();
				buWriter.append(al.getTurma());
				buWriter.newLine();
				buWriter.append("*----------------------*");
				buWriter.close();
				
				JOptionPane.showMessageDialog(null, "REGISTRO REALIZADO");
				
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}
	
	public void registrarProf (Professor prof) {
		
			String enderecoArquivo = "C:\\RepositorioGitHub\\MeuRepositorio\\CursoJavaProgrammer\\Aula-12-04-23\\arquivoEscolar\\professor.txt";
	
			try {
				
				BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo));
				
				buWriter.append(prof.getNome());
				buWriter.newLine();
				buWriter.append(Integer.toString(prof.getMatricula()));
				buWriter.newLine();
				buWriter.append(prof.getDisciplina());
				buWriter.newLine();
				buWriter.append("*----------------------*");
				buWriter.close();
				
				JOptionPane.showMessageDialog(null, "REGISTRO REALIZADO");
				
			
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	
	public void registrarCoordenador (Coordernador coord) {
		
			String enderecoArquivo = "C:\\RepositorioGitHub\\MeuRepositorio\\CursoJavaProgrammer\\Aula-12-04-23\\arquivoEscolar\\coordenador.txt";
			
			try {
				
				BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo));
				
				buWriter.append(coord.getNome());
				buWriter.newLine();
				buWriter.append(Integer.toString(coord.getMatricula()));
				buWriter.newLine();
				buWriter.append(coord.getGerencia());
				buWriter.newLine();
				buWriter.append("*----------------------*");
				buWriter.close();
				
				JOptionPane.showMessageDialog(null, "REGISTRO REALIZADO");
				
			
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	
}
