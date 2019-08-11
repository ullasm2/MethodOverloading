package org.univ;

public class College extends University {

	
	@Override
	public void ug() {
				
		System.out.println("UG Fees:25,000");
	}	
	
	@Override
	public void pg() {
		 
		System.out.println("PG Fees:35,000");
	}
	
	public static void main(String[] args) {
		College ab = new College();
		ab.ug();
		ab.pg();
	}
}
 
