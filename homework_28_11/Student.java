package homework_28_11;

public class Student {
	int grade = ((int)Math.random()*101);
	int age = ((int)Math.random()*103+18);
	String name;
	
	public Student(String name) {
		super();
		this.grade = grade;
		this.age = age;
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", age=" + age + ", name=" + name + "]";
	}
	
}
