package JavaTaskMobielsBrand;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SelectOne {
	
	Scanner sc = new Scanner(System.in);
	
	void show(HashMap<String, String> Samsung , HashMap<String,String> Apple ,HashMap<String,String> Onepluse, HashMap<String,String> Motorola , String s) {
		
		
		if(Samsung.containsValue(s) || Apple.containsValue(s)|| Onepluse.containsValue(s)|| Motorola.containsValue(s)) {
			
			
			
			for(Map.Entry<String,String>entry : Samsung.entrySet()) {
				
				if(s.equals(entry.getValue())){
					
					String s2;
					
					s2 = entry.getKey();
					
					System.out.println("Samsung :" + s2);
					
				}
			}
			
			for(Map.Entry<String,String> entry : Apple.entrySet()) {
				
				if(s.equals(entry.getValue())) {
					
                    String s2 ;
					
					s2 = entry.getKey();
					
					
					System.out.println("Apple :" + s2);
					
				}	
			}
					
					for(Map.Entry<String,String> entry : Onepluse.entrySet()){
						
						if(s.equals(entry.getValue())) {
							
							
							
							String s2;
							
							s2 = entry.getKey();
							
							
							System.out.println("Onepluse :" + s2);
							
						}
					}
							for(Map.Entry<String,String> entry : Motorola.entrySet()){
								
								if(s.equals(entry.getValue())) {
									
									System.out.println("Motorola :" + entry.getValue() + entry.getKey());
									
								}
								
							}
//								else {
//									
//									System.out.println("");
//								}
								
							}
							
							
						}
					
					
				
				
			
		}
	

	

