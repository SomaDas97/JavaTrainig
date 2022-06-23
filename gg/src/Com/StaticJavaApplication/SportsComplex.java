package Com.StaticJavaApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SportsComplex {
	
	public static void main(String args[] ) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		
		String condition = "yes";
				
		while(condition.equals("yes")) {
			
		System.out.println("Enter your Name :");
		
		String name = sc.next();
		
		
		
		al.add("Badminton");
		al.add("FootBall");
		al.add("Box Cricket");
		
		System.out.println("List of Sports");
		
		for(String s : al) {
			
			System.out.println(s);
		}
		System.out.println("Enter the sports Number");
		try {
		int i = sc.nextInt();
		if(i==1) {
		Badminton obj = new Badminton();
		obj.Badminton1();
				obj.BadmintonSlot();
			
			
		}
		else if(i==2)
		{		
			FootBall obj1 = new FootBall();
			obj1.FootBall1();
			obj1.FootBallSlot();
			
		}
		
		else {
			BoxCricket obj2 = new BoxCricket();
			obj2.BoxCricket1();
			obj2.BoxCricketSlot();
			
		}
		
		System.out.println("enter yes for continue and no for exit");
		condition=sc.next();
		
		}
		
		
		catch(Exception e) {
			
			System.out.println("Please Enter numbers only between 1-3");
			
		}
	
	

	}

}
}
