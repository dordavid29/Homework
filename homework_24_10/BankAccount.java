package homework_24_10;

public class BankAccount {

	private String accountName, accountNum;
	private double balance, overDraftSum;
	private boolean isOverDraftAllowed;

	public BankAccount() {
		super();
		this.accountName = "account";
		this.accountNum = "000001";
		this.balance = 0;
		this.isOverDraftAllowed = false;
		this.overDraftSum = 0;
	}

	public BankAccount(String accountName, String accountNum, double balance, boolean isOverDraftAllowed,
			double overDraftSum) {
		super();
		this.accountName = accountName;
		this.accountNum = accountNum;
		this.balance = balance;
		this.overDraftSum = (isOverDraftAllowed) ? overDraftSum : 0;
		this.isOverDraftAllowed = isOverDraftAllowed;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getOverDraftSum() {
		return overDraftSum;
	}

	public void setOverDraftSum(double overDraftSum) {
		this.overDraftSum = (isOverDraftAllowed) ? overDraftSum : 0;
	}

	public boolean getIsOverDraftAllowed() {
		return isOverDraftAllowed;
	}

	public void setIsOverDraftAllowed(boolean isOverDraftAllowed) {
		this.isOverDraftAllowed = isOverDraftAllowed;
	}

	public double deposit(double sumDepositing) {
		return (sumDepositing > 0) ? (balance += sumDepositing) : balance;
	}
	double oldBalance = balance;
	public double withdrawal(double sumWithdrawal) {
		System.out.println("Please enter sum withdrawal: " + sumWithdrawal);
		if (sumWithdrawal > 0) {
			if (sumWithdrawal < balance || isOverDraftAllowed && testOverDraft(sumWithdrawal)) {
				balance -= sumWithdrawal;
				System.out.println("Sum withdrawal approved: " + sumWithdrawal);
				return sumWithdrawal;
			} else if (isOverDraftAllowed && !testOverDraft(sumWithdrawal)) {
				balance = overDraftSum * (-1);
				System.out.println("Sorry, sum withdrawal approved: " + (overDraftSum + oldBalance));
				return overDraftSum + oldBalance;
			} else
				balance = 0;
				System.out.println("Sorry, sum withdrawal approved: " + oldBalance);
				return oldBalance;
		} else
			System.out.println("Sorry, sum withdrawal approved: 0");
			return 0;
	}

	public boolean testOverDraft(double sumWithdrawal) {
		return ((balance - sumWithdrawal) >= overDraftSum * (-1)) ? true : false;
	}

	public String toString() {
		return "Account name = " + getAccountName() + "\nAccount number: " + getAccountNum() + "\nBalance: "
				+ getBalance() + "\nIs over draft allowed: " + ((getIsOverDraftAllowed())?"yes":"no") + "\nOver draft sum: "
				+ getOverDraftSum();
	}

}