package warmup1;

public class BackAround {
	
	public static void main (String[] args) {
			
		System.out.println(backAround("a"));
		
		String palavra = "cat";
		
		if (palavra.length() > 1) {
			palavra = palavra.substring(palavra.length()-1) + palavra + palavra.substring(palavra.length()-1);
			System.out.println(palavra);
		}
		else 
			System.out.println(palavra+palavra+palavra);
		
	}

	public static String backAround(String str) {
		
		if (str.length() > 1) {
			return  str.substring(str.length()-1) + str + str.substring(str.length()-1);
	}		
		return str+str+str;
	}
}
/*
		Dada uma string, pegue o último caractere e retorne uma nova string com o último caractere adicionado na frente e atrás, 
		então "cat" produz "tcatt". A string original terá comprimento 1 ou mais.

		backAround("cat") → "tcatt"
		backAround("Hello") → "oHelloo"
		backAround("a") → "aaa



*/