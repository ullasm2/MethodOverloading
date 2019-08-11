package org.company;

import org.client.Client;

//Single inheritance Q 10 with Different package

public class Company extends Client {

	public void companyName() {
		System.out.println("Enter the Company Name");

	}
	
	public static void main(String[] args) {
		Company ab = new Company();
		ab.clientName();
		ab.companyName();
		
	}
	
}
