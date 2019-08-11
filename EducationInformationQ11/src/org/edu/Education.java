package org.edu;

public class Education extends Medicine {
public void ug() {
System.out.println("Education Qualification:ug");

}
	
public void pg() {
	System.out.println("Education Qualification:pg");

}
	public static void main(String[] args) {
		Education a=new Education();
		a.ug();
		a.pg();
		a.bA();
		a.bBA();
		a.bE();
		a.bEd();
		a.bsc();
		a.physiyo();
		a.bTech();
		a.mbbs();
	}


}
