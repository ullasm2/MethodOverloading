package org.india;

public class B implements A {

	public void mmsAcc() {
		System.out.println("MMS");
		}
	public void FixedDeposit() {
		System.out.println("Fixed Deposit");
	}
	
	

	
	@Override
	public void savingAccount() {
		System.out.println("Saving Account");
		
	}
	@Override
	public void jointAccount() {
		System.out.println("Joint Account");
		
	}
	
	// Calling only Interface method using InterfaceName,ref name & Class Name
	public static void main(String[] args) {
	A ab=new B();
	ab.savingAccount();
	ab.jointAccount();
	
		
		
		
		
		
		
	}

}
