package CoreJavaAssessmentNo19;

import java.util.Scanner;

public class InvalidUserName {
	
	public static void main (String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String s = sc.next();
		
		if(s.length()<10 || s=="&") {
			throw new Exception();
		}
		else {
			System.out.println("hii");
		}
	}

}
