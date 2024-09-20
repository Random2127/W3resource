package w3Resource.basics.constructor.validation;

public class Account {

	private String accNum;
	private double balance;

	public Account(String accNum, double balance) {

		if (accNum == null || accNum.isEmpty()) {
			System.out.println("Bank account cannot be empty nor null ");
			return;
		}
		if (balance < 0) {
			System.out.println("Balance cannot be negative");
			return;
		}

		this.accNum = accNum;
		this.balance = balance;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
