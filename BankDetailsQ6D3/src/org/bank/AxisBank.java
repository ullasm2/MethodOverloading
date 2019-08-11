package org.bank;

// Override deposit method into new class
public class AxisBank extends BankInfo{

@Override
public void deposit() {
System.out.println("6%");
}
	
public static void main(String[] args) {
	AxisBank ab=new AxisBank();
	ab.deposit();
	ab.fixed();
	ab.saving();

}
}
