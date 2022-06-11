package Block2;

//Exception try-catch

public class Division {
	
	public static void main(String args[]) {
		
		int dividend = 10;
		int divisor = 0;
		int result = 0;
	
	try {
		
		result = dividend / divisor ;
		
		System.out.println("result is" + result);	
	}
	catch (Exception e) {
		
		System.out.println(e);
	}
	System.out.println("End of program");
	}
}

