package New1;

public class main {
	
	public static void result(int x , int y , Operation obj) {
		
		System.out.println(obj.opt(x,y));
	}
	
	public static void main(String args[]) {
		
		result(40,10, (x, y)->(x+y));
		
	}

}
