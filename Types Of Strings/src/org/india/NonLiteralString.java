package org.india;
// When we try to store the same value, it gets store on the different location 
//Storage Location:Heap Memory

public class NonLiteralString {

	public static void main(String[] args) {
	
		String j=new String ("Java");
		String i=new String ("Java");
		System.out.println("Non Literal");
		
		System.out.println(System.identityHashCode(j));
		System.out.println(System.identityHashCode(i));

	}

}
