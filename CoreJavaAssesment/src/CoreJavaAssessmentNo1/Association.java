package CoreJavaAssessmentNo1;

import java.util.ArrayList;
import java.util.List;


	public class Association {

	 

	public static void main (String[] args)
	  {
	    Employee Obj1 = new Employee(4.5 , 2022);
	    Employee Obj2 = new Employee(4.0 , 2020);
	    Employee Obj3 = new Employee(3.5 , 2018);
	    
	    List<Employee> emp = new ArrayList<Employee>();
	    
	    emp.add(Obj1);
	    emp.add(Obj2);
	    emp.add(Obj3);
	   
	    
	    for(Employee e : emp){
	      System.out.println("Rating : " + e.rating + " and "
	          +" StartYear : " + e.startyear);
	    }
	  }
	}



