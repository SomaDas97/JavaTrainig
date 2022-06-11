package CoreJavaTaskCollectionNo4;
//perform following operations on array list
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.List;

public class ArrayLists {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(10);
		a.add(5);
		a.add(8);
		a.add(4);
		a.add(1);
		
		//How to Iterate ArrayList using Java ListIterator
		
		ListIterator<Integer> list = a.listIterator();
		
		while(list.hasNext()) {
			
			System.out.println(list.next());
		}
			for(Integer i : a) {
				System.out.println(i);
			}
			
			System.out.println("Add 24 in between 10 and 5");
			
			//ArrayList add element at specific index
			
			a.add(1,24);
			System.out.println(a);

			//Sort ArrayList in descending order
			
			Collections.sort(a , Collections.reverseOrder());
			
			System.out.println("ArrayList in desending order");
			
			for(Integer i : a) {
				System.out.println(i);
			}
			
			//replace an element at specified index ArrayList
			
			
			a.set(3, 5);
			System.out.println(a);
			
			//Search an element of Java ArrayList
			
			if(a.contains(4)) {
				System.out.println("Found the Number");
			}
			else {
				System.out.println("Not Found");
			}
			
			//Remove element from specified index ArrayList
			
			a.remove(4);
			System.out.println(a);	
			
			
			System.out.println("-------------------END-------------------");
			
	}

}
