package principal;

import java.util.Scanner;

import entidades.ProfessorSenior;
import servico.CalcularSalario;

public class Principal {
	
	public static void main (String[] args) {
		
		ProfessorSenior profSenior = new ProfessorSenior();
		CalcularSalario calcularSalario = new CalcularSalario();
		
		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("Cadastro de Prof");
		System.out.println("Cadastro SENIOR");
		
		System.out.println("Digite o nome do Professor senior");
		profSenior.nome = entradaDados.next();
		
		System.out.println("CPF");
		profSenior.cpf = entradaDados.next();
		
		System.out.println("horas");
		profSenior.qtdHorasTrabalhadas = Integer.parseInt(entradaDados.next());
		
		profSenior.qtdHorasTrabalhadas = 100;
		profSenior.valorHoratrabalhada = 10;
		
		
		profSenior.salarioBruto = calcularSalario.calcularSalarioBruto(100, 10.0);
		
		System.out.println("O salario bruto é : " + profSenior.salarioBruto);
		System.out.print("O nome é : " + profSenior.nome);
		
		
		
		
	}

}
