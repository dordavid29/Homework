package homework_10_10;

public class Program {

	public static void main(String[] args) {
		Pizza p1 = new Pizza(36, 8, 2);
		Pizza p2 = new Pizza(42, 8, 4);
		Pizza p3 = new Pizza(30, 6, 1);
		Pizza p4 = new Pizza(32, 6, 0);
		Pizza p5 = new Pizza(38, 8, 4);
		System.out.println("-------------PIZZA 01---------------");
		p1.print();
		p1.isBasicPizza();
		System.out.println("-------------PIZZA 02---------------");
		p2.print();
		p2.isBasicPizza();
		System.out.println("-------------PIZZA 03---------------");
		p3.print();
		p3.isBasicPizza();
		System.out.println("-------------PIZZA 04---------------");
		p4.print();
		p4.isBasicPizza();
		System.out.println("-------------PIZZA 05---------------");
		p5.print();
		p5.isBasicPizza();
		System.out.println("-----------------------------------");
		System.out.println("The sum of all toppings is: " + (p1.getToppings()+p2.getToppings()+p3.getToppings()
			+p4.getToppings()+p5.getToppings()));
	}

}
