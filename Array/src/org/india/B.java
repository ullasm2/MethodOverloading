package org.india;

// Array - Collection of similar data types
// Values can be stored based on the index value

public class B {

	// Allow duplicate values
	public static void main(String[] args) {
		int num []=new int [5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=10;
		System.out.println(num[0]);
	
		//Intialization 
	int n[]= {10,20,30,40,50};
	System.out.println(n[3]);	
	//Error- When length limit exceeds, it throws AN ERROR]
	
	//Override the array
	// Array will print the last value in the given index 
	
	num[0]=10;
	num[1]=20;
	num[2]=30;
	num[3]=40;
	num[4]=10;
	num[4]=50;
	
	//forloop
			
	System.out.println(n[4]);
	
	for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
	}
	
	//Foreach or forloop or advancedLoop
	//Will not check any condition or iteration
	// Better performance
	
	System.out.println("Foreach");
	for(int i:num) {
	System.out.println(i);
	}
	
	
	
	
}
	
}
