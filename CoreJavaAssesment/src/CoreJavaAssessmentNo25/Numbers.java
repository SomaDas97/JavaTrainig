package CoreJavaAssessmentNo25;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		
		System.out.println(al);
		
		List<Integer> doubleArray = al.stream().map(i ->i*2).collect(Collectors.toList());
		
		System.out.println(doubleArray);
				
				
				
				
				
				
		
	
		
		
		
	}

}
