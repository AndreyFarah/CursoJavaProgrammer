package principal;

import java.util.Scanner;

import entidades.ProfessorJunior;
import entidades.ProfessorPleno;
import entidades.ProfessorSenior;
import servico.SalarioServico;
import entidades.ProfessorPleno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entradaDados = new Scanner(System.in);
		ProfessorSenior proSenior = new ProfessorSenior();
		SalarioServico seSalarioServico = new SalarioServico();
		
		ProfessorPleno proPleno = new ProfessorPleno();
		ProfessorJunior proJunior = new ProfessorJunior();
		
		
		//Cadastro Professor Senior
		System.out.println("----Cadastro de Professor-----");
		System.out.println("###Cadastro Professor Senior###");
		System.out.println("Digite o nome do professor Senior");
		proSenior.nome = entradaDados.next();
		System.out.println("Digite o CPF do professor Senior");
		proSenior.cpf = entradaDados.next();
		System.out.println("Digite as Horas do professor Senior");
		proSenior.qtdHorasTrabalhadas = Integer.parseInt(entradaDados.next());
		
		proSenior.valorHoraTrabalhada = 100; 
		proSenior.irSenior = 10;
		
		//Calcular o Salario Bruto Senior
		proSenior.salarioBruto = seSalarioServico.calcularSalBruto(proSenior.qtdHorasTrabalhadas, proSenior.valorHoraTrabalhada);
		
		
		//Calcular o Salario Liquido Senior
		proSenior.salarioLiquido = seSalarioServico.calcularSalLiquido(proSenior.salarioBruto, proSenior.irSenior);
		
		System.out.println("O salário Bruto é: " + proSenior.salarioBruto);
		System.out.println("O salário Líquido (Bruto - IR) é :" + proSenior.salarioLiquido);
		
/*		--------------------------------------------------------------------------
		
		//Cadastro Professor Pleno
		System.out.println("###Cadastro Professor Pleno###");
		System.out.println("Digite o nome do professor Pleno");
		proPleno.nome = entradaDados.next();
		System.out.println("Digite o CPF do professor Pleno");
		proPleno.cpf = entradaDados.next();
		System.out.println("Digite as Horas do professor Pleno");
		proPleno.qtdHorasTrabalhadas = Integer.parseInt(entradaDados.next());
		
		proPleno.valorHoraTrabalhada = 80;
		proPleno.irPleno = 7;
		
		//Calcular o Salario Bruto Pleno
		proPleno.salarioBruto = seSalarioServico.calcularSalBruto(proPleno.qtdHorasTrabalhadas, proPleno.valorHoraTrabalhada);
		//Calcular o Salario Liquido 
		proPleno.salarioLiquido = seSalarioServico.calcularSalLiquido(proPleno.salarioBruto, proPleno.irPleno);
		
		System.out.println("O salário Bruto é: " + proPleno.salarioBruto);
		System.out.println("O salário Líquido (Bruto - IR) é :" + proPleno.salarioLiquido);
		
		//Cadastro Professor Junior
		System.out.println("###Cadastro Professor Junior###");
		System.out.println("Digite o nome do professor Junior");
		proJunior.nome = entradaDados.next();
		System.out.println("Digite o CPF do professor Junior");
		proJunior.cpf = entradaDados.next();
		System.out.println("Digite as Horas do professor Junior");
		proJunior.qtdHorasTrabalhadas = Integer.parseInt(entradaDados.next());
		
		proJunior.valorHoraTrabalhada = 60;
		proJunior.irJunior = 5;
		
		//Calcular Salario Bruto Junior
		proJunior.salarioBruto = seSalarioServico.calcularSalBruto(proJunior.qtdHorasTrabalhadas, proJunior.valorHoraTrabalhada);
		proJunior.salarioLiquido = seSalarioServico.calcularSalLiquido(proJunior.salarioBruto, proJunior.irJunior);
		
		System.out.println("O salário Bruto é: " + proJunior.salarioBruto);
		System.out.println("O salário Líquido (Bruto - IR) é :" + proJunior.salarioLiquido);
		
		
		//System.out.println(proJunior.salarioBruto);
		
		
		
		
		*/
		

	}

}
