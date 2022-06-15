package CoreJavaAssessmentNo15;

import java.io.File;
import java.io.PrintWriter;

import CoreJavaAssessmentNo1.Employee;

public class Employees {
	
	 String name;
	 int empid ;
	 	
	 	Employees(String name , int empid){
	 		
	 		this.name=name;
	 		this.empid=empid;
	 		
	 	}
	 	
	 	void display() {
	 		System.out.println(name + " " + empid);
	 	}
	 	
	 	public static void main(String args[]){
	 		
	 		Employees e1 = new Employees("Soma", 101);
	 		Employees e2 = new Employees("Surovita" , 102);
	 		
	 	    e1.display();
	 	    e2.display();	  	    
	 		try {
	 			File f = new File("test.txt");
	 	    PrintWriter pw = new PrintWriter("test.txt");
	 	    pw.println(e1.empid+""+e1.name);
	 	    pw.println(e2.empid+""+e2.name); 
	 	    f.setReadOnly();                                             
	 	    pw.flush();
	 	    pw.close();
	 	    System.out.println("com");
	 		}catch(Exception e) {
	 			System.out.println(e);
	 		}
	 	}

	 		

}
