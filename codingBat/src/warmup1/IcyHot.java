package warmup1;

public class IcyHot {

	public static void main (String[] args) {
		
	System.out.println(icyHot(-1 , 120));
	
		
		
		
	}
	
	
	public static boolean icyHot(int temp1, int temp2) {
		
	//	if ((temp1 < 0) && (temp2 > 100) || (temp1 > 0 && temp2 <100)) {
			
	//		return true;
	//	}

		return ((temp1 < 0) && (temp2 > 100) || (temp1 > 0 && temp2 <100));
		  
	}
	
	
}
