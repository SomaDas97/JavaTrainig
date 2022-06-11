package CoreJavaTaskException1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;


public class InvalidIdException extends Exception {
	public InvalidIdException(String str) {
		super();
	}
	
	public static void main(String args[]) {
		
		Pojo p1 = new Pojo(101,"Soma","Kolkata");
		Pojo p2 = new Pojo(102 , "Sabarna", "Bangalore");
		Pojo p3 = new Pojo(103 , "Sourav", "Mumbai");
		Pojo p4 = new Pojo(104 , "Surovita" , "Kolkata");
		
		ArrayList<Pojo> al = new ArrayList<>();
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
	//System.out.println(al.toString());
		System.out.println("Enter id");
		Scanner sc = new Scanner(System.in);
		 int id1 = sc.nextInt();
		 
		// ListIterator<Pojo> list = al.listIterator();
		 
//		 while(list.hasNext()) {
//				
//				System.out.println(list.next());
//		}
				//for(Pojo i : al) {
				//	System.out.println(i);
				//}
		try { 
		if(id1== p1.id ||id1==p2.id || id1==p3.id || id1==p4.id)
		{
			System.out.println("Welcome to Office");
			return ;
		}
		
		else{
			throw new InvalidIdException("Please enter valid id");
		}
		}
		catch(InvalidIdException e) {
			System.out.println("please enter valid id");
		}
		System.out.println("Hii");
		
	}
}


