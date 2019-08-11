package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
private void TransportForm() {
	System.out.println("Enter the Transport Form");
}
	
	public static void main(String[] args) {
		Transport ab = new Transport();
		Air cd = new Air();
		Road ef = new Road();
		Water gh = new Water();
		
		ab.TransportForm();
		cd.aeroPlane();
		cd.heliCopter();
		ef.bike();
		ef.bus();
		ef.car();
		gh.boat();
		gh.ship();
		
	}
	
	
}
