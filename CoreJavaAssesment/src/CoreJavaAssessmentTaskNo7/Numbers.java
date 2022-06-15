package CoreJavaAssessmentTaskNo7;

import java.util.HashMap;
import java.util.Map;

// In an array of 1-10, multiple numbers are duplicates, how do you find duplicates using Map implemented classes.

public class Numbers {
	
	public static void main(String args[]) {
		
		Integer[] array = {1,2,2,3,4,5,6,6,7,7,9,10};
		
		Map<Integer, String> m = new HashMap<>();
		
		
		for(Integer a : array) {
			
			
			if(m.containsKey(a)) {
				
				System.out.println("duplicate number is :" + a);	
			}
			else {
				m.put(a,"Real");
			}
		}
		
		
	}

}
