package PolymorphismPractice;
//Method Overloading

public class Test {
	public static void main(String args[]) {
		Test t = new Test();
		t.show(10);
		
	} 
	void show(String args[]) {
		System.out.println("1");
	}
	void show(int a) {
		System.out.println("2");
	}
}
