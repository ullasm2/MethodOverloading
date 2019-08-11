package org.phone;

public class InternalStorage {
	
	public void processorName() {
		System.out.println("Enter the Processor Name");

	}
	public void ramSize() {
		System.out.println("Enter the Ram Size");
	}
	public static void main(String[] args) {
		
	InternalStorage ab=new InternalStorage();
	ab.processorName();
	ab.ramSize();
	ExternalStorage cd=new ExternalStorage();
	cd.size();
		
	}
}

