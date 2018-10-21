package homework_17_10;

public class Airport {

	public static void main(String[] args) {
		Basic p = new Pilot("Lichay", "Tiram", 86425, 3.8);
		Basic a = new AirSteward("Maor", "Landau", "Israel", "business", 2.5);
		Basic d = new DaleLand("Mashe", "Cohen", "USA", "check out", 8.5);
		Basic t = new Traveler("Nil", "Golan", 5264833);
		p.print();
		a.print();
		d.print();
		t.print();

	}

}
