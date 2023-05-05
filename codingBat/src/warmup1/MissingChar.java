package warmup1;

public class MissingChar {

	public static void main(String[] args) {
		
		String valor = missingChar("kitten",1);

		System.out.println(valor);
	}
	
	
	public static String missingChar(String str, int n) {
		  
		   String a = str.substring(0,n);
		   String b = str.substring((n+1), str.length());
		  	   
		  return a+b;
	}
	
}


/* 
Dada uma string não vazia e um int n, retorne uma nova string onde o char no índice n foi removido.
O valor de n será um índice válido de um caractere na string original 
(ou seja, n estará no intervalo 0..str.length()-1 inclusive).
*/
