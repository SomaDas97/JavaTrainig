package CoreJavaTask;

public class Contacts {
	void createContact(String name , long number1 ,  long number2) {
		
		System.out.println("contact"+ " " + name + "phn"+ " "+ number1 + "phn2" + " "+number2);
	}
	void createContact(String name, long number1) {
		
		System.out.println("contact 2"+" "+name+" phn1"+" " +number1 );
		
	}
	public static void main(String args[]) {
		
		Contacts c = new Contacts();
		c.createContact("soma",4567698l,86424388l);
		c.createContact("soma2",65235l);
		
	}

}
