package org.college;

public class Student extends dept {

	
	public void studentName() {
		System.out.println("Enter the Student Name:");

	}
	
public void studentDept() {
	System.out.println("Enter the Student Dept:");

	}

public void studentId() {
	System.out.println("Enter the Student ID:");

}

public static void main(String[] args) {
	Student ab = new Student();

ab.studentName();
ab.studentDept();
ab.studentId();
ab.collegeName();
ab.collegeRank();
ab.collegeCode();
ab.HostelName();
ab.deptName();


	
}

	
}
