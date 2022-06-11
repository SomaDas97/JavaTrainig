package OopsStart;

public class StudentJava {
	String name;
	int age;
	int roll_number;
	StudentJava(String name,int age, int roll_number){
		this.name = name;
		this.age = age;
		this.roll_number = roll_number;
	}
	void display(){
		System.out.println("name        " +" "+"age        " +" "+"roll_number       ");
		System.out.println(name +"      "+age +"         "+roll_number);
	}
	public static void main(String args[]) {
		StudentJava S1= new StudentJava("Soma", 24 , 12);
		StudentJava S2= new StudentJava("Surovita", 23 , 13);
		StudentJava S3= new StudentJava("Sholanki", 22 , 14);
		S1.display();
		S2.display();
		S3.display();
	}
}
