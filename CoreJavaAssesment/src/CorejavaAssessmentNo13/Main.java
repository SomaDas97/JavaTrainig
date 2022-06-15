package CorejavaAssessmentNo13;

public class Main extends Thread {
	
public void show(){
		
		System.out.println("hii");
		
	}
	
	public static void main(String args[]) {
		
		Main obj1 = new Main();
		Main obj2 = new Main();
		Main obj3 = new Main();
		Main obj4 = new Main();
		
		obj1.setName("Soma");
		obj1.setDaemon(true);
		System.out.println(obj1.isDaemon());
		obj1.start();
		
		
		System.out.println(obj1.getName());
		System.out.println(obj2.getName());
		System.out.println(obj3.getName());
		System.out.println(obj4.getName());
		
		
	}
}
