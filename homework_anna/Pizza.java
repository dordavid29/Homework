package homework_anna;

public class Pizza {
	private int diameter, slices, toppings;

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

	public Pizza(int diameter, int slices, int toppings) {
		super();
		this.diameter = diameter;
		this.slices = slices;
		this.toppings = toppings;
	}

	public int getToppings() {
		return toppings;
	}

}