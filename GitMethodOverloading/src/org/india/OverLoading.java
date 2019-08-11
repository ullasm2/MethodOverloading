package org.india;

public class OverLoading {
public void empDetails(int empid) {
System.out.println(empid);
}
	
public void empDetails(String empName, int empid) {
	System.out.println(empName+empid);

}
		
public static void main(String[] args) {
	
	OverLoading l = new OverLoading();
	l.empDetails(123456);
	l.empDetails("Jay", 23654);
}
		
	}


