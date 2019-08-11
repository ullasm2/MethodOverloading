package org.india;

public class AxisBank {
	
	public void savingAccount() {
		System.out.println("This is a saving account");
		
	}
	
	public void currentAccount() {
		System.out.println("This is a current account");
		
	}
	
	public static void main(String[] args) {
		AxisBank Ul = new AxisBank();
		IndianBank ab = new IndianBank();
		Ul.savingAccount();
		Ul.currentAccount();
		ab.eduloanAccount();
	
				}


}
