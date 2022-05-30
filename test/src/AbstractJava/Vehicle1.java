package AbstractJava;
//Abstract in java

abstract class Vehicle {
	abstract void start();
}
class Car extends Vehicle{
	public void start() {
		System.out.println("car start with key");
	}
}
	class Scooter extends Vehicle{
		public void start() {
			System.out.println("scooter start with kick");
		}
	}
	public class Vehicle1
	{
	
		public static void main(String args[]) {
			Car c = new Car();
			c.start();
			Scooter s = new Scooter();
			s.start();
		}
	}
	

