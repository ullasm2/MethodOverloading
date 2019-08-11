package org.india;

public class Employee {
//Depends upon the Data Type
public void findEmployee(int empID) {
		System.out.println("My Employee ID is:" +empID);
	}
//Depends upon the Order Type
public void findEmployee(String empName, int emID) {
			System.out.println("Emp Name & Emp ID is:"+empName +" " +emID);
	
	}
	 
//Depends upon the 
public static void main(String[] args) {
		Employee e = new Employee();
		e.findEmployee(2024);
		e.findEmployee("Ullas", 3015);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
