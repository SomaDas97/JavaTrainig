package BasicsOfJava;

import java.util.*;

 public class Number1 {
	 
	public static int getGreaterValue(int a , int b){
		
		Scanner sc = new Scanner(System.in);
		if (a>b){
			return a;
		}
		else {
			return b;
		}
	}
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);                                            
	
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	
	
	System.out.println(getGreaterValue(a , b));
	
	
		
		
	}
}
