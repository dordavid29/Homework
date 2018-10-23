package class_21_10;

public class Program {
	public static IFly createIFly(){
		int num = (int)(Math.random() * 3);
		if (num == 0) {
			System.out.println("Bird");
			return new Bird();
		}
		if (num == 1) {
			System.out.println("Airplane");
			return new Airplane();
		}
		if (num == 2) {
			System.out.println("Kit");
			return new Kite();
		}else return null;
	}
	public static void main(String[] args) {
		IFly[] fly = new IFly[3];
		for (IFly f : fly) {
			f = createIFly();
			f.fly((double)Math.random()*300);
			System.out.println("Land: " + f.land());
			System.out.println("-----------------");
		}
			
	}

}
