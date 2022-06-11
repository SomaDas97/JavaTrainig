package CoreJavaTaskCollectionNo1;
//Wite a Java program to create read only data using List, Set and Map in example
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class ReadOnly {
	
	public static void main(String args[]) {
		  
		List<String> l = new ArrayList<>();
		
		l.add( "One");
		l.add( "Two");
		l.add( "Three");
		l.add( "Four");
		l.add( "Five");
		
		System.out.println("List values :" + l);
		
		Set<String> s = new HashSet<>(l);
		
		s.add("Six");
		s.add("Seven");
		
		System.out.println("Set values :"+ s);
		
		Map<String, Integer > m = new HashMap<>();
		
		m.put("Soma", 7);
		m.put("Vita", 8);	
		
		for(Map.Entry mp: m.entrySet()) {
			
			System.out.println(mp.getKey()+ " " + mp.getValue());
		}
		 
		
	}
}
		 
		 
		 
