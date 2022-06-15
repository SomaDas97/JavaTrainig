package CoreJavaAssessmentNo21;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Operation op = new Operation();
		int i = sc.nextInt();
		if(i==1 ||i==2 ||i==3 || i==4){
			
			double d = op.calculate(i, sc.nextDouble(), sc.nextDouble());
			
			System.out.println(d);
		}
		else {
			try {
				throw new Exception ("put valid value");
				
			}catch(Exception e){
				
				System.out.println(e);
				
			}
			
		}
	}

}
