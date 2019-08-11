package org.india;

public class RbiBank extends HdfcBank {

	public void fixedDeposit() {
		System.out.println("This is Deposit Account");

	}
	public static void main(String[] args) {
		RbiBank ab = new RbiBank();
		ab.currentAccount();
		ab.savingAccount();
		ab.fixedDeposit();
	}
}
