package InterfaceJava;
//interface in java
interface Number2{
	void show();
	}
interface Number1{
	 void display();
}
class Test implements Number2 , Number1{
	public void show() {
		System.out.println("1");
	}
	 public void display() {
		System.out.println("2"); 

}
}