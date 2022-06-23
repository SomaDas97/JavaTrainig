package Com.StaticJavaApplication;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class BoxCricket {
	
	Scanner sc = new Scanner(System.in);
	
    HashMap<Integer , String> availableSlots = new HashMap<>();
	
	//HashMap<Integer , String> bookedSlots = new HashMap<>();
	
	public void BoxCricket1() {
		
		availableSlots.put( 1 ,  "10:00-12:00");
		availableSlots.put( 2 ,  "12:00-02:00");
		availableSlots.put( 3 ,  "02:00-04:00");
		availableSlots.put( 4 ,  "04:00-06:00");
		availableSlots.put( 5 ,  "06:00-08:00");
		
		
for(Entry m : availableSlots.entrySet() ) {
			
			System.out.println(m.getKey() + " " + m.getValue());
			
}
	}			
			public void BoxCricketSlot() {
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


