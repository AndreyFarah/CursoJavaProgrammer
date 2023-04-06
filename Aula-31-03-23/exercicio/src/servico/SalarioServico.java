package servico;

//Retorno Salario Bruto
public class SalarioServico {
	
	public double calcularSalBruto(int qtdHoraTrabalhada, double valorHora) {
		
		double salarioTemp = valorHora * qtdHoraTrabalhada;
		double valorBonus = 25;
		double porcentagemBonus = valorBonus / 100;
		double valorBonusBruto = salarioTemp * porcentagemBonus;
	/*	double valorBonus = 25.0 / 100;
		double valorBonusBruto = salarioTemp * valorBonus ; */
		
		if (qtdHoraTrabalhada > 500) {
			
			salarioTemp =  salarioTemp + valorBonusBruto;
		}
		
		return salarioTemp;
	}
	
	//Retorna Salario Liquido
	public double calcularSalLiquido (double salBruto, double descontoIr) {
		
		double porcentagem = descontoIr / 100;
		
		double valorDesconto = salBruto * porcentagem;
		
		double salLiquido = salBruto - valorDesconto;
		
		return salLiquido;	
	}
	
	
	
	
}
