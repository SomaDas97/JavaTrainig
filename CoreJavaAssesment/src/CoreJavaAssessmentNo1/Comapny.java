package CoreJavaAssessmentNo1;

import java.util.List;

public class Comapny {
	
	private static List<Employee> employees;
	
	  public Comapny(List<Employee> emp) {
		// TODO Auto-generated constructor stub
	}
	void Company(List<Employee> employees)
	  {
	    this.employees = employees;
	  }
	  public static List<Employee> getTotlEmployeesInComapny(){
		  
	    return employees;
	  }
	
	
}
