package CoreJavaTaskCollection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountriesKeySet {
	
	
	
	private static Entry<String, String> entry;
	private static String capital;
	private static String countries;

	public static void main(String args[]) {
		
		Map<String , String> m = new HashMap<>();
		
		
       // Enter Countries and Capitals
		
		m.put("India", "New Delhi");
		m.put("BanglaDesh", "Dhaka");
		m.put("Japan", "Tokyo");
		m.put("United Kingdom", "London");
		m.put("Singapore", "Singapore");
		m.put("Russia", "Moscow");
		m.put("Italy", "Rome");
		
		
	
		//using keyset() Iterator over keys
		
		for(String countries : m.keySet())
		System.out.println("key :" + countries);
		
		for(String capital : m.values())
		System.out.println("values :" + capital);
		
		

}
}