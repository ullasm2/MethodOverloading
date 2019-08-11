package org.india;

// Concat stores in a new memory
// a and b stores in a same location after concat it stores in a different location
public class ImmutableString {
public static void main(String[] args) {
	
	String a ="Selenium";
	String b ="Selenium";
	String cc=a.concat(b);
	System.out.println("Immutable");
	System.out.println(cc);
	System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(b));
	System.out.println(System.identityHashCode(cc));
	
}
}
