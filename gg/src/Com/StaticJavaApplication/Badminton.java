package Com.StaticJavaApplication;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Badminton {
	

	Scanner sc = new Scanner(System.in);
	
	HashMap<Integer , String> availableSlots = new HashMap<>();
	
	//HashMap<Integer , String> bookedSlots = new HashMap<>();
	
	public  void Badminton1() {
		
		availableSlots.put( 1 , "-" + "10:00-11:00");
		availableSlots.put( 2 , "-" + "11:00-12:00");
		availableSlots.put( 3 , "12:00-01:00");
		availableSlots.put( 4 , "01:00-02:00");
		availableSlots.put( 5 , "02:00-03:00");
		availableSlots.put( 6 , "03:00-04:00");
		availableSlots.put( 7 , "04:00-05:00");
		availableSlots.put( 8 , "05:00-06:00");
		availableSlots.put( 9 , "06:00-07:00");
		availableSlots.put( 10, "07:00-08:00");
		
		for(Entry m : availableSlots.entrySet() ) 
		{
			
			System.out.println(m.getKey() + " " + m.getValue());
		
		}
		
	}
	
	public void BadmintonSlot() {
		
		System.out.println("enter the slot number");
		
		int SlotNumber=sc.nextInt();
		
		if(availableSlots.containsKey(SlotNumber)) {
			
			availableSlots.remove(SlotNumber);
	
			System.out.println("you have successfully booked slot with slot number "+ SlotNumber);

			
			for(Entry m : availableSlots.entrySet() ) 
			{
				
				System.out.println(m.getKey() + " " + m.getValue());
			
			}
			
		
		}
}
}