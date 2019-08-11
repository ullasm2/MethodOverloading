package org.india;
// When you try to store the same value it get stores on the same location 
// Storage Location:String Pool or String constant
public class LiteralString {

	public static void main(String[] args) {
		String name = "Ullas";
		String lastname ="Ullas";
		System.out.println("LiteralString");
		
		System.out.println(System.identityHashCode (name));
		System.out.println(System.identityHashCode (lastname));

	}

}
