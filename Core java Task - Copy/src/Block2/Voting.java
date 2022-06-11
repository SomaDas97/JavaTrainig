package Block2;

import java.util.Scanner;

public class Voting {
	
	public static void main(String args []) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your age :");
		
		int age = s.nextInt();
		
		try {
			if (age < 18)
			{
				
				throw new YoungerAgeException ();
			}
			else {
				System.out.println("Vote sucsessfully");
			}
		}
		catch(Exception e)
		{
			System.out.println("You are not eligible");
		}
		System.out.println("Hello");
		
	}
	}


