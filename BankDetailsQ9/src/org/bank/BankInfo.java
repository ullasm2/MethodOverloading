package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
		System.out.println("Savings Account");

	}
	public void fixed() {
		System.out.println("Fixed account");
	}
	public static void main(String[] args) {
		BankInfo a=new BankInfo();
		a.saving();
		a.fixed();
		a.deposit();
		
	}
		
	}
