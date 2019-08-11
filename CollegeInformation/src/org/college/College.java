package org.college;

public class College {
public void collegeName() {
	System.out.println("Enter the College Name:");
	}
	
public void collegeCode() {
	System.out.println("Enter the College Code:");
}
public void collegeRank() {
	System.out.println("Enter the College Rank:");
}

public static void main(String[] args) {
	College ab = new College();
	Dept cd = new Dept();
	Hostel ef = new Hostel();
	Student gh = new Student();
	
	ab.collegeName();
	ab.collegeCode();
	ab.collegeRank();
	cd.deptName();
	ef.hostelName();
	gh.studentName();
	gh.studentDept();
	gh.studentId();
	
	
	
	
	
	
	
	
}


	
	
	
	
	
	
	
	
}
