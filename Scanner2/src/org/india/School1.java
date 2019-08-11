package org.india;

import java.util.Scanner;

public class School1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the studentId");
		String studentId = s.next();
		System.out.println("This is ur studentId");
		System.out.println(studentId);
	
		System.out.println("Enter the studentName");
		String studentName = s.next();
		System.out.println("This is ur studentName");
		System.out.println(studentName);
		
		System.out.println("Enter the Marks");
		int Eng = s.nextInt();
		int Hindi = s.nextInt();
		int Maths = s.nextInt();
		int Science = s.nextInt();
		int Physics = s.nextInt();
		int total = Eng+Hindi+Maths+Science+Physics;
		float avg = total/5;
		
		System.out.println("Total Marks :"+total);
		System.out.println("Avg is :"+avg);
		
		
		
	
	}
	
	
}
