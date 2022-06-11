package OopsStart;

public class Animal_Inheritance
{
	public static void main(String args[])
	{
	  Cat c=new Cat();
	  c.run();
	  c.eat();
	}
}

class Dog 
{
	void eat() {
		System.out.println("I am eating");
	}
}
class Cat extends Dog
{
	void run()
	{
		System.out.println("cat is running");
		
	}
}