package CoreJavaTaskFileNo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

class Employee {
	
 String name;
int empid ;
	
	Employee(String name , int empid){
		
		this.name=name;
		this.empid=empid;
		//System.out.println("name" + " " + "empid");
	}
	
	void display() {
		System.out.println(name + " " + empid);
	}
	
	public static void main(String args[]){
		
		Employee e1 = new Employee("Soma", 101);
		Employee e2 = new Employee("Surovita" , 102);
		
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
