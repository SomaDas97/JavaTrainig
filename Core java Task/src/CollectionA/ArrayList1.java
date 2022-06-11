package CollectionA;

import java.util.ArrayList;
import java.util.Collections;



public class ArrayList1 {
	
	public static void main(String args []) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add (0);
		list.add (1);
		list.add (3);
		
		System.out.println(list);
		
		//get element
		
		System.out.println("--------------------");
		
		int element = list.get(0);
		System.out.println(element);
		
		//add element in between 
		
		System.out.println("--------------------");
		
		list.add(2,2);
		System.out.println(list);
		
		// set element
		
		System.out.println("--------------------");
		
		list.set(1,5);
		System.out.println(list);
		
		//delete element
		
		System.out.println("--------------------");
		
		list.remove(0);
		System.out.println(list);
		
		
		//size
		
		System.out.println("--------------------");
		
		int size = list.size();
		System.out.println(list);
		
		//Loops
		
		System.out.println("--------------------");
		
		for (int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		//Sorting
		
		System.out.println("--------------------");
		
		Collections.sort(list);
		System.out.println(list);
		
	}
	

}
