package org.add;

public class GreensTech {
	
public void greensOmr(int phoneNo,String LocationName) {
System.out.println("PhoneNo & Location Name " +phoneNo +" " +LocationName);

}

public void greensOmr(String LocationName,long PhoneNo) {
System.out.println("Location Name & PhoneNo" +" "+LocationName +" " +PhoneNo);
}

public void greensOmr(String Area1, String Area2, String Area3) {
System.out.println("Area:" +" " +Area1 +" " +Area2 +" " +Area3);
}

public static void main(String[] args) {
GreensTech ab=new GreensTech();
ab.greensOmr(994021287, "Porur");
ab.greensOmr("Porur", 994021287);
ab.greensOmr("Annanagar", "Porur", "Tambaram");
}

}
