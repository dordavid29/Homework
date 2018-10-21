package homework_17_10;

public class AirSteward extends Basic {
	private String country, theClass;
	private double seniority;
	@Override
	public void print() {
		super.print();
		System.out.println(", seniority: " + seniority + " year/s" +", country of origin: " + country + ", class: " + theClass);
	}

	public AirSteward(String firstName, String lastName, String country, String theClass, double seniority) {
		super(firstName, lastName);
		this.country = country;
		this.theClass = theClass;
		this.seniority = seniority;
	}
	
}
