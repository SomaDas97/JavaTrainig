package CoreJavaAssessmentNo9;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {
	
	public static void main(String args[]) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("five");
		
		Iterator i1 = (Iterator) al.iterator();
		
		while(((java.util.Iterator<String>) i1) . hasNext()) {
			
			System.out.println(((java.util.Iterator<String>) i1).next());
		}
		ListIterator<String> i2 = al.listIterator();
		
		while(i2 .hasNext()) {
			
			System.out.println(i2.next());
		}
		
		ListIterator i3 = al.listIterator();
		
		while(i2.hasPrevious()) {
			
			System.out.println(i2.previous());
		}
	}
}
