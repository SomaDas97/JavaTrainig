package New1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorCursor {
	
	public static void main(String args []) {
		
		List l = new ArrayList();
		
		l.add(27);
		l.add("Soma");
		l.add("Das");
		
		
		
		
		ListIterator li = l.listIterator();
		li.next();
		li.next();
		li.next();
		
		
		while(li.hasPrevious()) {
			
			System.out.println(li.previous());
		}
	}

}
