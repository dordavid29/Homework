package homework_10_10;

public class Pizza {
	private int diameter, slices, toppings;

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		this.slices = slices;
	}

	public int getToppings() {
		return toppings;
	}

	public void setToppings(int toppings) {
		this.toppings = toppings;
	}

	public boolean isBasicPizza() {
		if (this.toppings == 0) {
			System.out.println("This pizza is basic");
			return true;
		} else {
			System.out.println("This pizza isn't basic");
			return false;
		}
	}

	public void print() {
		System.out.println("The diameter pizza is: " + diameter + "\nThe number slices pizza is: " + slices
				+ "\nThe number topping/s pizza is: " + toppings);
	}

	public Pizza() {
		super();
		this.diameter = (int)(Math.random() * 40) + 10;
		this.slices = (int)(Math.random() * 7) + 1;
		this.toppings = (int)(Math.random() * 4);
	}

}