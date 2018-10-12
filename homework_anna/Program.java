package homework_anna;

public class Program {

	public static void main(String[] args) {
		Pizza p1 = new Pizza(36, 8, 2);
		Pizza p2 = new Pizza(42, 8, 4);
		Pizza p3 = new Pizza(30, 6, 1);
		Pizza p4 = new Pizza(32, 6, 0);
		Pizza p5 = new Pizza(38, 8, 4);
		p1.isBasicPizza();
		p2.isBasicPizza();
		p3.isBasicPizza();
		p4.isBasicPizza();
		p5.isBasicPizza();
		p1.print();
		p2.print();
		p3.print();
		p4.print();
		p5.print();
		System.out.println("The sum of all toppings is: " + (p1.getToppings()+p2.getToppings()+p3.getToppings()
			+p4.getToppings()+p5.getToppings()));
	}

}
