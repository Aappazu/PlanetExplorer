package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.*;

public class TestPlanetExplorer {

	@Test
	public void landingCompletedRoute() {
		PlanetExplorer pExplorer = new PlanetExplorer(100,100);
		
		pExplorer.setLocation(5, 5,"E");
		
		assertEquals("llfffffrfffff", pExplorer.land(pExplorer));
	}
	
	@Test
	public void getLandingLocation(){
		PlanetExplorer pExplorer = new PlanetExplorer(100,100);
		
		pExplorer.setLocation(5,5, "E");
		
		pExplorer.land(pExplorer);
		
		assertEquals("(0,0,N)", pExplorer.getCurrentLocation());
	}
	
	@Test
	public void currentLocationReturn(){
		PlanetExplorer pExplorer = new PlanetExplorer(10,10);
		
		pExplorer.setLocation(5, 5, "E");
		
		assertEquals("(5,5,E)", pExplorer.getCurrentLocation());
	}
	
	@Test
	public void turnLeftFromFacingEast(){
		
		PlanetExplorer pExplorer = new PlanetExplorer(10,10);
		
		pExplorer.setLocation(5, 5, "E");
		
        pExplorer.turnLeft();
		
		assertEquals("(5,5,N)", pExplorer.getCurrentLocation());
	}
	
	@Test
	public void turnRightFromFacingEast(){
		
		PlanetExplorer pExplorer = new PlanetExplorer(10,10);
		
		pExplorer.setLocation(5, 5, "E");
		
        pExplorer.turnLeft();
		
		assertEquals("(5,5,N)", pExplorer.getCurrentLocation());
	}
	
}
