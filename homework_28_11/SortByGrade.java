package homework_28_11;

import java.util.Comparator;

public class SortByGrade implements Comparator<Student>{
	
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getGrade() - s2.getGrade();
	}

}
