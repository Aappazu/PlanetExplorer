package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.*;

public class TestPlanetExplorer {

	@Test
	public void landingCompleted() {
		PlanetExplorer pExplorer = new PlanetExplorer(100,100);
		
		pExplorer.setLocation(5, 5,"E");
		
		assertEquals("llfffffrfffff", pExplorer.land(pExplorer));
	}
	
	@Test
	public void currentLocationReturn(){
		PlanetExplorer pExplorer = new PlanetExplorer(10,10);
		
		pExplorer.setLocation(5, 5, "E");
		
		assertEquals("(5,5,E)", pExplorer.getCurrentLocation());
	}
	
}
