package PolymorphismPractice;
//Method Overriding

class Test1 {

void show() {
	System.out.println("1");
}	
}
class Xyz extends Test1{
	@Override
	void show() {
		System.out.println("2");
	}
}

public class TestMain{
	
	
	public static void main(String args[]){
		Test1 t = new Test1();
		t.show();
		Xyz x = new Xyz();
		x.show();
	}
}
