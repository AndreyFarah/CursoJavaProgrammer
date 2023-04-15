package menu;

import javax.swing.JOptionPane;

import arquivo.RegistrarArquivo;
import cadastro.Cadastrar;
import entidades.Aluno;
import entidades.Coordernador;
import entidades.Professor;

public class Menu {

	public void menu () {
		
		//int opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("1- ALUNO / 2 - PROFESSOR / 3 - COORDENADOR"));
				
		
		//INSTANCIANDO
		Cadastrar chamaCadastro = new Cadastrar();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		Coordernador coodernador = new Coordernador();
		RegistrarArquivo rArquivo = new RegistrarArquivo();	
		
		int opcaoMenu;

		Boolean sair = true;
		
		
		do {
			
			opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("1- ALUNO / 2 - PROFESSOR / 3 - COORDENADOR / 4 - SAIR"));
			
			if (opcaoMenu == 1) {
				//chamaCadastro.exibirAluno(chamaCadastro.cadastrarAluno()); // outra possibilidade da fazer chamar e xibir em uma linha só
				aluno = chamaCadastro.cadastrarAluno();
				chamaCadastro.exibirAluno(aluno);	
				rArquivo.registrarAluno(aluno);
			}
			
			if (opcaoMenu == 2) {
				professor = chamaCadastro.cadastrarProfessor();
				chamaCadastro.exibirProfessor(professor);
				rArquivo.registrarProf(professor);
				
			}
			if (opcaoMenu == 3){
				chamaCadastro.exibirCoordenador(chamaCadastro.cadastrarCoordenador());
				rArquivo.registrarCoordenador(coodernador);
				
			}
			if (opcaoMenu == 4) {
				System.out.println("sair");
				sair = false;
			}
			
		}while(sair);
			System.exit(0);
		
	}
}
