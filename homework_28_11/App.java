package homework_28_11;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Student> s = new ArrayList<>();
		
		s.add(new Student("Niv"));
		s.add(new Student("Ben"));
		s.add(new Student("Golan"));
		s.add(new Student("Rotem"));
		s.add(new Student("Tomer"));
		// ---- before the sort ----
		System.out.println (s.toString());
		Collections.sort(s, new SortByAge());
		Collections.sort(s, new SortByGrade());
		Collections.sort(s, new SortByName());
		// ---- after the sort ----
		System.out.println (s.toString());
	}
}
