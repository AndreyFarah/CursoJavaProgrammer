package warmup1;

public class StartHi {

	public static void main(String[] args) {
		
		
		System.out.println(startHi("h"));
		
		
	}
	
	public static boolean startHi(String str) {
		
		if (str.length()<2) 
			return false;
		
		String s = str.substring(0, 2);
		
		if (s.equals("hi")) {
			return true;
		}else {
			return false;
		}
	}
	
}
