package CoreJavaAssessmentNo23;

// Perform calculations such as count,sum,min,avg,max for given input of arrayList using Stream API.

import java.util.ArrayList;
import java.util.Comparator;

public class Elements {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(5);
		al.add(4);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(3);
		al.add(5);
		
		System.out.println(al);
		
		
		//Count operation
		
		long l = al.stream().count();
		
		System.out.println(l);
		
		//Sum Operation
		
		int sum = al.stream().mapToInt(i->i).sum();
		
		System.out.println(sum);
		
		//Minimun and Maximun
		
		int num = al.stream().min(Comparator.comparing(Integer :: valueOf)).get();
		
		System.out.println(num);
		
		int number = al.stream().max(Comparator.comparing(Integer :: valueOf)).get();
		
		System.out.println(number);
		
		
		
		
		
		
	}

}
