package org.india;

public class CompanyInfo {

	
	// String is used once
public void companyName(String name) {
		System.out.println("My Emp Name:" +name);
	}

// String is used Twice
public void companyName(String sec, String Company, int EmpId) {
	System.out.println("Section,Company & EmpID:" +sec +" "+Company +" " +EmpId);

}

public static void main(String[] args) {
	CompanyInfo ab = new CompanyInfo();
	ab.companyName("Eros Group");
	ab.companyName("C Section", "Eros", 123456);
			
}

}