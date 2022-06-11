package New1;

public class Test
{
     public static void main(String args [])
     {
    	 
    	 A a1 = new A();
    	 Thread th= new Thread(a1);
    	 th.start();
     }

}

class A implements Runnable
{
	public  void run() 
	{
		System.out.println("123567890-");
	}
	
}