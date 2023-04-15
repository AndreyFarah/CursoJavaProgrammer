package cadastro;

import javax.swing.JOptionPane;
import entidades.Aluno;
import entidades.Coordernador;
import entidades.Professor;

public class Cadastrar {
	
	
	public Aluno cadastrarAluno () {
		
		Aluno cadastro = new Aluno();
		
		cadastro.setNome(JOptionPane.showInputDialog("Digite o nome do ALUNO"));
		cadastro.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula do ALUNO")));
		cadastro.setTurma(JOptionPane.showInputDialog("Digite a turma do ALUNO"));
		
		return cadastro;

	}
	
	public void  exibirAluno (Aluno alunoParametreo) {
	
		JOptionPane.showMessageDialog(null, "O nome do Aluno é: " + alunoParametreo.getNome());
		JOptionPane.showMessageDialog(null, "A matricula do Aluno " + alunoParametreo.getMatricula() );
		JOptionPane.showMessageDialog(null, "A turma do Aluno é : " + alunoParametreo.getNome());
		
	}
	
	public Professor cadastrarProfessor() {
		
		Professor cadastroProf = new Professor();
		
		cadastroProf.setNome(JOptionPane.showInputDialog("Digite o nome do Professor"));
		cadastroProf.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula do Professor")));
		cadastroProf.setDisciplina(JOptionPane.showInputDialog("Digite a Disciplina"));	
		
		return cadastroProf;
	}
	
	public void exibirProfessor (Professor professorParametro) {
		
		JOptionPane.showMessageDialog(null, "O nome do Aluno é: " + professorParametro.getNome());
		JOptionPane.showMessageDialog(null, "O nome do Aluno é: " + professorParametro.getMatricula());
		JOptionPane.showMessageDialog(null, "O nome do Aluno é: " + professorParametro.getDisciplina());
		
	}
	
	public Coordernador cadastrarCoordenador() {
		
		Coordernador cadastroCoordenador = new Coordernador();
		
		cadastroCoordenador.setNome(JOptionPane.showInputDialog("Digite o nome do Coordenador"));
		cadastroCoordenador.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula do Coordenador")));
		cadastroCoordenador.setGerencia(JOptionPane.showInputDialog("Informe a gerencia do Coordenador"));
		
		return cadastroCoordenador;
	}
	
	public void exibirCoordenador (Coordernador coordenadorParametro) {
		
		JOptionPane.showMessageDialog(null, "O Coordenador é : " + coordenadorParametro.getNome());
		JOptionPane.showMessageDialog(null, "A matricula do  Coordenador é : " + coordenadorParametro.getMatricula());
		JOptionPane.showMessageDialog(null, "A gerencia do Coordenador é : " + coordenadorParametro.getGerencia());
		
	}
	
		
}
