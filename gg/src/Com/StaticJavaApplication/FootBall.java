package Com.StaticJavaApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FootBall {
	
	Scanner sc = new Scanner(System.in);
	

	HashMap<Integer , String> availableSlots = new HashMap<>();
	
	//HashMap<Integer , String> bookedSlots = new HashMap<>();
	
	public void FootBall1() {
		
		
		availableSlots.put( 1 ,"  " + "10:00-10:30");
		availableSlots.put( 2 ,"  " + "10:30-11:00");
		availableSlots.put( 3 ,"  " + "11:00-11:30");
		availableSlots.put( 4 ,"  " + "11:30-12:00");
		availableSlots.put( 5 ,"  " + "12:00-12:30");
		availableSlots.put( 6 ,"  " + "12:30-01:00");
		availableSlots.put( 7 ,"  " + "01:00-01:30");
		availableSlots.put( 8 ,"  " + "01:30-02:00");
		availableSlots.put( 9 ,"  " + "02:00-02:30");
		availableSlots.put( 10 ,"  " + "02:30-03:00");
		availableSlots.put( 11 ,"  " + "03:00-03:30");
		availableSlots.put( 12 ,"  " + "03:30-04:00");
		availableSlots.put( 13 ,"  " + "04:00-04:30");
		availableSlots.put( 14 ,"  " + "04:30-05:00");
		availableSlots.put( 15 ,"  " + "05:00-05:30");
		availableSlots.put( 16 ,"  " + "05:30-06:00");
		availableSlots.put( 17 ,"  " + "06:00-06:30");
		availableSlots.put( 18 ,"  " + "06:30-07:00");
		availableSlots.put( 19 ,"  " + "07:00-07:30");
		availableSlots.put( 20 ,"  " + "07:30-08:00");
		
		
		for(Entry m : availableSlots.entrySet() ) 
		{
			
			System.out.println(m.getKey() + " " + m.getValue());
		
		}
	}
		public void FootBallSlot() {
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