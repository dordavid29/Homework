package class_21_10;

public class Bird implements IFly{
	String kind, color;
	double age;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	
	@Override
	public void fly(double speed) {
		System.out.println("Speed: " + speed);
	}
	
	@Override
	public boolean land() {
		return false;
	}

}
