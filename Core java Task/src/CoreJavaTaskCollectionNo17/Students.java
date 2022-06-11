/** A school offers medals to the students of tenth based on the following criteria
If(Marks>=90) : Gold
If(Marks between 80 and 90) : Silver
If(Marks between 70 and 80) : Bronze
Note: Marks between 80 and 90 means marks>=80 and marks<90
Write a function which accepts the marks of students as a Hashmap and return the details of the students eligible for
 the medals along with type of medal.
The input hashmap contains the student registration number as key and mark as value.
The output hashmap should contain the student registration number as key and the medal type as value.**/

package CoreJavaTaskCollectionNo17;
import java.util.HashMap;

public class Students {
	public static void main(String args[]) {
		
		HashMap<Integer , Integer> map = new HashMap<>();
		
		map.put(101 , 90 );
		map.put(102 , 74 );
		map.put(103 , 50 );
		map.put(104 , 85 );
		map.put(105 , 65 );
		
		System.out.println(map);
		
		for(Integer i : map.keySet()) {
			if(map.get(i)>=90) {
				System.out.println(i + " Gold ");
			}
			else if (map.get(i)<90 && map.get(i)>= 80) {
				System.out.println(i +  " Silver ");
			}
			else if(map.get(i)<80 && map.get(i)>=70) {
				System.out.println(i + " Bronze ");
			}
			else {
				System.out.println(i + " Better luck next time ");
			}
		}
	}

}
