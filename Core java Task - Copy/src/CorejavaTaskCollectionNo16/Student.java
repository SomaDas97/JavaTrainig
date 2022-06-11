package CorejavaTaskCollectionNo16;

import java.util.HashMap;

/**Input:HashMap
{selva:75.6f, abi:89.5f,ram:40}
Output:hashmap
{selva:pass,abi:pass,ram:fail}
If the mark is >60 return the names and their status as pass in a output hashmap else fail
**/

public class Student {
	
	public static void main(String args[]) {
		
		HashMap<String , Double> map = new HashMap<>();
		
		map.put("Selva", 75.6);
		map.put("abi", 89.5);
		map.put("Ram", (double) 40);
		
		System.out.println(map);
		
		for(String s : map.keySet()) {
			
			if(map.get(s)>60) {
				
				System.out.println(s + "- PASS");
			}
			else {
				
				System.out.println(s + "- FAIL");
			}
			
			
		}
		
	}

}
