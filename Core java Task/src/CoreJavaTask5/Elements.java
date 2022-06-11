package CoreJavaTask5;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Elements {
	
	public static void main(String args []) {
		
		LinkedList<String> l = new LinkedList<>();
		
		l.add("Soma");
		l.add("Surovita");
		l.add("Sabarna");
		l.add("Sourav");
		l.add("Sanu");
		
		List<String> list = new ArrayList<String>(l);
		list.addAll(l);
		for(String x:list)
		{
			System.out.println(x);
		}
		
		
		
		
		
	}

}
