package PrimeNumber;

import java.util.Scanner;

public class PrimeNumberCheck {
	
	public static void main(String args[]) {
		
		int n;
		boolean isPrime =true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int num = sc.nextInt();
		
		for(int i = 2 ; i<= num/2 ; i++) {
			
			n= num%i ;
			if(n==0) {
			 isPrime = false;
			 break;
			}
		}
		if(isPrime) {
			System.out.println(num + "is a prime Number");
		} else {
			System.out.println(num + "is not a prime nUmber");
		}
	}

}
