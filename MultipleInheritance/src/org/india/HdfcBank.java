package org.india;

public class HdfcBank extends SbiBank  {
	
	public void eduLoan() {
		
System.out.println("This is a EduLoan");
	}

	public static void main(String[] args) {
		HdfcBank ab = new HdfcBank();
		ab.currentAccount();
		ab.fixedDeposit();
		ab.savingAccount();
		ab.eduLoan();
	}
}
