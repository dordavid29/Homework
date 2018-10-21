package homework_17_10;

public class Traveler extends Basic {
	
	private int passport;
	@Override
	public void print() {
		super.print();
		System.out.println(", number passport: " + passport);
	}

	public Traveler(String firstName, String lastName, int passport) {
		super(firstName,lastName);
		this.passport = passport;
	}
	
}
