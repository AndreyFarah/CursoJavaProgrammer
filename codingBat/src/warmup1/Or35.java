package warmup1;

public class Or35 {

	public static void main(String[] args) {
	
		System.out.println(testeOr(-3));
	
		
	}
	
	public static boolean testeOr (int n) {
		
		if (n>0 && (n % 3 == 0 || n % 5 == 0)) {
			
			return true;
		}
		
		return false;
	}

}


/*

Retorne true se o número não negativo fornecido for um múltiplo de 3 ou um múltiplo de 5. Use o operador % "mod" -- consulte Introdução ao Mod


ou35(3) → verdadeiro
ou35(10) → verdadeiro
ou35(8) → falso
*/