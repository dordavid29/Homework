package homework_17_10;

public class DaleLand extends Basic {
	private String country, job;
	private double seniority;
	@Override
	public void print() {
		super.print();
		System.out.println(", country of origin: " + country + ", seniority: " + seniority + " year/s" + ", job" + job);
	}

	public DaleLand(String firstName, String lastName, String country, String job, double seniority) {
		super(firstName, lastName);
		this.country = country;
		this.job = job;
		this.seniority = seniority;
	}
	
}
