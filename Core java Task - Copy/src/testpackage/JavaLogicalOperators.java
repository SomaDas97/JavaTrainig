package testpackage;

public class JavaLogicalOperators {
	public static void main(String args[]) {
		int a = 60;
		int b = 100;
		int c = 20;
		String result= a>b&&a>c?a+" a is largest number":b>c?b+" b is largest number":c+" c is largest Number";
		System.out.println(result);
		//System.out.println(a);
	}

}
