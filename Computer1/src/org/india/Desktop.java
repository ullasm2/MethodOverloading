package org.india;

public class Desktop extends Computer {

	public void desktopSize() {
	
		System.out.println("Enter the Desktop Size:");
	}
	
	public static void main(String[] args) {
		
		Desktop ab = new Desktop();
		
		ab.computerModel();
		ab.desktopSize();
	}



}
