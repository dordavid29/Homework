package homework_24_10;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount bankAccount1 = new BankAccount("Golan Cohen", "35261456", 50000, true, 10000);
		System.out.println("--------bankAccount1----------");
		System.out.println(bankAccount1.toString());
		System.out.println("------------------");
		bankAccount1.deposit(2000);
		System.out.println("--------Status bank account after the deposit-------");
		System.out.println(bankAccount1.toString());
		System.out.println("------------------");
		bankAccount1.withdrawal(55000);
		System.out.println("--------Status bank account after the withdrawal num: 1-------");
		System.out.println(bankAccount1.toString());
		System.out.println("------------------");
		bankAccount1.withdrawal(12000);
		System.out.println("--------Status bank account after the withdrawal num: 2-------");
		System.out.println(bankAccount1.toString());
		System.out.println("--------bankAccount2----------");
		BankAccount bankAccount2 = new BankAccount("Moshe Gil", "35261457", 10000, false, 20000);
		System.out.println(bankAccount2.toString());
		System.out.println("------------------");
		bankAccount1.withdrawal(55000);
		System.out.println("--------Status bank account after the withdrawal-------");
		System.out.println(bankAccount2.toString());
	}

}
