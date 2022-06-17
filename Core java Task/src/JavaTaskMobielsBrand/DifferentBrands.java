package JavaTaskMobielsBrand;

import java.util.HashMap;
import java.util.Scanner;

public class DifferentBrands {
	
	Scanner sc = new Scanner(System.in);
	
	SelectOne obj1 = new SelectOne();
	
	
	public void Phones() {
		
		HashMap<String,String> Samsung = new HashMap<>();
		
		Samsung.put("S1","Android");
		Samsung.put("S2","Android");
		Samsung.put("A1","Keypad");
		Samsung.put("Z2","Quaty Keypad");
		
		
		HashMap<String,String> Apple = new HashMap<>();
		
		Apple.put("X max", "ios");
		Apple.put("Xi", "ios");
		Apple.put("Xi max", "ios");
		Apple.put("Xii", "ios");
		
		
		HashMap<String,String> Onepluse = new HashMap<>();
		
		Onepluse.put("6" , "Android");
		Onepluse.put("6t" , "Android");
		Onepluse.put("7t" , "Android");
		Onepluse.put("7 pro" , "Android");
		
		
		HashMap<String,String> Motorola = new HashMap<>();
		
	    Motorola.put("Moto G60", "Android");
		Motorola.put("Moto E40", "Android");
		Motorola.put("Moto Edge 20", "Quaty Keypad");
		Motorola.put("Moto Razr", "Keypad");
		
		
		System.out.println("Please select one");
		
		String s = sc.nextLine();
		obj1.show(Samsung , Apple , Onepluse , Motorola , s);
		
		
		
	}
	
	

}
