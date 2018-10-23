package class_21_10;

public class Kite implements IFly {
	String color;
	double price;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = (price>0)?price:0;
	}
	@Override
	public void fly(double speed) {
		System.out.println("Speed: " + speed);
	}
	@Override
	public boolean land() {
		return true;
	}

}
