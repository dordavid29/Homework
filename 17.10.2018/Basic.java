package homework_17_10;

public abstract class Basic {

		private String firstName, lastName;
		
		public void print() {
			System.out.print("First name: " + firstName + ", last name: " + lastName);
		}

		public Basic(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
}
