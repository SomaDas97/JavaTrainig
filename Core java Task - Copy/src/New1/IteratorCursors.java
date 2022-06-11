package New1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCursors {
	
	public static void main(String args[]) {
		
		List l = new ArrayList();
		
		l.add(1);
		l.add("Soma");
		l.add("Das");
		
		
		Iterator<Comparable> itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
