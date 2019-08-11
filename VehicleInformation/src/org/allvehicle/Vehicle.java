package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {

	public void VehicleNecessery() {
		System.out.println("Enter the VehicleNecessery");

	}	
	
	
	public static void main(String[] args) {
		Vehicle ab = new Vehicle();
		TwoWheller cd = new TwoWheller();
		ThreeWheeler ef = new ThreeWheeler();
		FourWheeler gh =new FourWheeler();
		
		
		ab.VehicleNecessery();
		cd.bike();
		cd.cycle();
		ef.Auto();
		gh.bus();
		gh.car();
		gh.lorry();
	}
	
	
	
	
	
	
	
	
	
}
