package org.company;

public class CompanyInfo {
	
	public void companyName() {
		System.out.println("Enter the Company Name");
	}

	public void companyId() {
		System.out.println("Enter the Company ID");
	}
	public void companyAddress() {
		System.out.println("Enter the Company Address");

	}
	
	public static void main(String[] args) {
		CompanyInfo ab = new CompanyInfo();
		
		ab.companyName();
		ab.companyId();
				ab.companyAddress();
			
	
	}
}
