package class_21_10;

public class Airplane implements IFly {
	String namePilot, nameCompany, destination;

	public String getNamePilot() {
		return namePilot;
	}

	public void setNamePilot(String namePilot) {
		this.namePilot = namePilot;
	}

	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public void fly(double speed) {
		System.out.println("Speed: " + speed);
	}

	@Override
	public boolean land() {
		return true;
	}

}
