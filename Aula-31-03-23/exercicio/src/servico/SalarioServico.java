package servico;

//Retorno Salario Bruto
public class SalarioServico {
	
	public double calcularSalBruto(int qtdHoraTrabalhada, double valorHora) {
		
		double salarioTemp;
		salarioTemp = valorHora * qtdHoraTrabalhada;
		
		
		
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
