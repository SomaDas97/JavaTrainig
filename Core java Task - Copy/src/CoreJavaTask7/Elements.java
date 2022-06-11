package CoreJavaTask7;

import java.util.*;

public class Elements {
	
	public static void main(String args[]) {
		
		ArrayList<String> a = new ArrayList<>();
		
		a.add("Aman");
		a.add("Bidita");
		a.add("Suman");
		a.add("Kriti");
		a.add("Yukti");
		
		for(String str : a) {
			System.out.println(a);
		}
		Collections.sort( a , Collections.reverseOrder());
		
		
		for(String str : a) {
			System.out.println(a);
		}
		
		
		
		
	}

}
