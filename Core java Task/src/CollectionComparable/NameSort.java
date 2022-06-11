package CollectionComparable;

import java.util.Comparator;

public class NameSort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name.equals(o2.name)) {
			return o1.marks-o2.marks;
		}
		else {
			return o1.name.compareTo(o2.name);
		}
	}

}
