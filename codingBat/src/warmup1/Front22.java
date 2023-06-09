package warmup1;

public class Front22 {

	public static void main(String[] args) {

		System.out.println(front22("kitten"));
		
		

	}
	
	public static String front22(String str) {
		
		if (str.length() <= 2) {
			
			return str + str + str;
		}
		
		return str.substring(0,2) + str + str.substring(0,2);
	}
	
}

/*
			Dada uma string, pegue os 2 primeiros caracteres e retorne a string com os 2 caracteres
			adicionados na frente e atrás, então "kitten" produz "kikittenki". Se o comprimento da 
			string for menor que 2, use os caracteres que estiverem lá.
			
			
			front22("kitten") → "kikittenki"
			front22("Ha") → "HaHaHa"
			front22("abc") → "ababcab"
*/