package org.india;

import java.util.Scanner;

public class AxisBank {

// Nested If (else, else if, else if, else)
	public static void main(String[] args) {
		
		Scanner ab= new Scanner(System.in);
		System.out.println("Enter A Value");
		int a = ab.nextInt();
		System.out.println("Enter B Value");
		int b =ab.nextInt();
		System.out.println("Enter C Value");
		int c =ab.nextInt();
			
		if(a>b && a>c){
			System.out.println("A is Greater");
			
		} else if (b>a && b>c){
			System.out.println("B is Greater");
			}else {
				System.out.println("C is Greater");
			}

	}

}
