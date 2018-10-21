package homework_17_10;

public class Pilot extends Basic {
	private int license; 
	private double seniority;
	@Override
	public void print() {
		super.print();
		System.out.println(", number license: " + license + ", seniority: " + seniority + " year/s");
	}

	public Pilot(String firstName, String lastName, int license, double seniority) {
		super(firstName, lastName);
		this.license = license;
		this.seniority = seniority;
	}
	

}
