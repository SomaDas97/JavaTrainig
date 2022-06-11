package CoreJavaTaskCollection3;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class Countries {
	
	
		
		private static Entry<String, String> entry;

		public static void main(String args[]) {
			
			Map<String , String> m = new HashMap<>();

			m.put("India", "New Delhi");
			m.put("BanglaDesh", "Dhaka");
			m.put("Japan", "Tokyo");
			m.put("United Kingdom", "London");
			m.put("Singapore", "Singapore");
			m.put("Russia", "Moscow");
			m.put("Italy", "Rome");
			
			
			for(Map.Entry<String , String> entry: m.entrySet())
			System.out.println("Key =" + entry.getKey() + "Value =" + entry.getValue());
		}

	}



