package New1;

public class FinnalyBlockExample {
	
	public static void main(String args[]) {
		try {
			int result = 10/0;
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("End");
	}

}
