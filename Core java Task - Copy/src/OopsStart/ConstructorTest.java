package OopsStart;

public class ConstructorTest {
	String Name;
	int emp_id;
	int Money;
	ConstructorTest(String Name, int emp_id,int Money){
		this. Name = Name;
		this. emp_id = emp_id;
		this. Money = Money;
	}
	public static void main(String args[]) {
		ConstructorTest C1= new ConstructorTest("Soma",101,2000 );
		ConstructorTest C2= new ConstructorTest("Sabarna", 420,2500);
		System.out.println("ConstructorTest C1 :" +C1.Name+" "+C1.emp_id+" "+C1.Money);
		System.out.println("ConstructorTeast C2 :"+C2.Name+" "+C2.emp_id+" "+C2.Money);
		
	}

}
