package warmup1;

public class FrontBack {
	
	public static void main (String[] args) {
		
	 String r = frontBack("a");
	 
	 System.out.println(r);
		
		
	//System.out.println(palavra.charAt(palavra.length()-1));
	//System.out.println(palavra.substring(0,1));
	//System.out.println(palavra.substring(1, palavra.length()-1));
		
		
		
	}
	
	public static String frontBack(String str) {
		
		if (str.length() <= 1) {
			return str;
		}
		
		return str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0);
	}

/*	public static String frontBack(String str) {
		
		if (str.length() >= 2) {
		String primeiraLetra = str.substring(0,1);
		String ultimaLetra = str.substring(str.length()-1);
		String meioLetra = str.substring(1,str.length()-1);
		
		System.out.println(primeiraLetra);
		System.out.println(ultimaLetra);
		System.out.println(meioLetra);
		
		String textoResult = ultimaLetra + meioLetra + primeiraLetra;
		
		return textoResult;
		}
		return str;
	} */
	
}



/* 
 
Dada uma string, retorne uma nova string onde o primeiro e o último caracteres foram trocados.

		frontBack("code") → "eodc"
		frontBack("a") → "a"
		frontBack("ab") → "ba"


*/