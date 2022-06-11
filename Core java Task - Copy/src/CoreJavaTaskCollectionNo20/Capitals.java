package CoreJavaTaskCollectionNo20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Capitals {
	
	 public static void main(String args[]) {
		 
		 Scanner sc = new Scanner(System.in);
		HashMap<String , String> hm = new HashMap<>();
		
		hm.put("West Bengal", "Kolkata");
		hm.put("TamilNadu", "Chennai");
		hm.put("Karanataka" , "Bengaluru");
		
		System.out.println(hm);
		 String s =sc.next();
		 
		  for(Map.Entry<String,String> x:hm.entrySet()) {
			  
			  if(s.equalsIgnoreCase(x.getKey())) {
				  System.out.println(x.getValue());
			  }
		
		
	
}
}
}