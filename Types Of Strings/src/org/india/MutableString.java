package org.india;

public class MutableString {
public static void main(String[] args) {
	
	StringBuffer r = new StringBuffer("Oracle");
	StringBuffer k = new StringBuffer("Oracle");
	System.out.println("StringBuffer");
	
	StringBuffer ap = r.append(k);
	System.out.println(System.identityHashCode(r));
	System.out.println(System.identityHashCode(k));
	System.out.println(System.identityHashCode(ap));
}
}
