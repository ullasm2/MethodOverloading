package org.phone;

public class PhoneInfo {
	public void phoneName() {
		System.out.println("Enter the Phone Number");
	}
	public void phoneMieiNum() {
		System.out.println("Enter the IEI Num");
	}	
	public void Camera() {
		System.out.println("Enter the Camera Pixel");
	}
public void storage() {
	System.out.println("Enter the Phone Storage");
}
public void osName() {
	System.out.println("Enter the OS Name");
}

public static void main(String[] args) {
	PhoneInfo bc = new PhoneInfo();
	bc.phoneName();
	bc.phoneMieiNum();
	bc.Camera();
	bc.storage();
	bc.osName();
	
}




}
