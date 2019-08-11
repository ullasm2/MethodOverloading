package org.phone;

public class Phone {

public void phoneInfo(int cost, String Brand) {
	System.out.println("Cost & Brand is:"+cost + Brand );

	}

public void phoneInfo(String Brand, int cost) {
	System.out.println("Brand & Cost is:"+Brand + cost);
}


public static void main(String[] args) {
	Phone ab = new Phone();
	ab.phoneInfo(123456, "Samsung");
	ab.phoneInfo("Samsung", 123456);
}
}
