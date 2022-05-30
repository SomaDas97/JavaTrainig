package AssociationPractice;
//concept of Association


class Addition
{
	private String Name;
	Addition (String name){
		this.Name= name;
	}
	public String GetBankName(){
		return this.Name;
	}
}
public class Bank
{
	 public static void main(String args[]) {
		 Addition bank= new Addition("HDFC");
			Employee emp= new Employee("soma");
			System.out.println(emp.getEmployeeName() 
					+"is employee of"+
					bank.GetBankName());
			
			
		}
}

class Employee{
	private String Name;
	Employee(String name){
		this.Name=name;
	}
	public String getEmployeeName() {
		return this.Name;
	}

}
