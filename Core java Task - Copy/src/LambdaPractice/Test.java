package LambdaPractice;

import java.util.ArrayList;

public class Test {
	
	public static void main(String args []) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(8);
		al.add(10);
		al.add(11);
		
		// PRINT ALL NUMBER
		
		al.forEach(System.out::println);
		
		System.out.println("----------");
		
		// PRINT EVEN NUMBER 
		
		al.forEach(n->{if(n%2 == 0) System.out.println(n);});
	}

}
