package org.edu;

public class Arts extends Education {
	public void bSc() {
		System.out.println("bSc Fees=50,000");
	}
	public void bEd() {
		System.out.println("bEd Fees=60,000");

	}
	public void bA() {
		System.out.println("bA Fees=70,000");
		
	}
	public void bBA() {
		System.out.println("bBA Fees=80,000");
		
	}
	@Override
	public void ug() {
			System.out.println("ug Fees=85,000");
	}
	
	@Override
	public void pg() {
		
			System.out.println("pg Fees=85,000");
	}
	
	public static void main(String[] args) {
	Arts ab = new Arts();
	ab.bA();
	ab.bBA();
	ab.bEd();
	ab.bSc();
	ab.ug();
	ab.pg();
	
	}
	
	
	
}
