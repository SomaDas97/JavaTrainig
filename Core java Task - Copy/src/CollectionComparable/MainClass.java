package CollectionComparable;

import java.util.*;

public class MainClass {
	
	public static void main(String args []) {
		
		List<Student>Student = new ArrayList<>();
		
		Student.add(new Student(50 , "Soma"));
		Student.add(new Student(60 , "Surovita"));
		Student.add(new Student(25 , "Sourav" ));
		Student.add(new Student(90 , "Sanu" ));
		Student.add(new Student(87 , "Sholanki"));
		
		Collections.sort(Student);
		
	//Student.forEach(System.out::println);
		
		for(Student s:Student)
		{
			System.out.println(s);
		}
	}

}
