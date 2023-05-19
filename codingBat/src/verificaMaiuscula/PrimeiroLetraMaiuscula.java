package verificaMaiuscula;

public class PrimeiroLetraMaiuscula {
	
	public static void main(String[] args) {
		//	PT: Escreva uma função ou método, que receba uma string como parâmetro e responda se seu primeiro caractere é maiúsculo ou não.
		//	bool IsFirstUpper(string s)
		
		//VerificaMaiuscula veriMaiuscula = new VerificaMaiuscula();
		
		//boolean result;
		
		//result = veriMaiuscula.verificaCaracter("andrey");
		System.out.println(isFirstUpper("Andrey"));
		//System.out.println(result);
		
		
	}
	
	public static boolean isFirstUpper (String str) {
		
		boolean msg;
		
		char [] texto = str.toCharArray();
		
		if (texto[0] == 'A') {
			msg = true;
			return msg;
		}
		msg = false;
		return msg;
	}
	
	
}
