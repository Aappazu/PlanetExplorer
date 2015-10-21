package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.*;

public class TestPlanetExplorer {
	
	@Before
	public void setup(){
		PlanetExplorer pExplorer = new PlanetExplorer(100,100);
	}

	@Test
	public void landingCompletedRoute() {
		
		pExplorer.setLocation(5, 5,"E");
		
		assertEquals("llfffffrfffff", pExplorer.land(pExplorer));
	}
	
	@Test
	public void getLandingLocation(){
		
		pExplorer.setLocation(5,5, "E");
		
		pExplorer.land(pExplorer);
		
		assertEquals("(0,0,N)", pExplorer.getCurrentLocation());
	}
	
	@Test
	public void currentLocationReturn(){
		
		pExplorer.setLocation(5, 5, "E");
		
		assertEquals("(5,5,E)", pExplorer.getCurrentLocation());
	}
	
	@Test
	public void turnLeftFromFacingEast(){
		
		
		pExplorer.setLocation(5, 5, "E");
		
        pExplorer.turnLeft();
		
		assertEquals("(5,5,N)", pExplorer.getCurrentLocation());
	}
	
	@Test
	public void turnRightFromFacingEast(){
		
		pExplorer.setLocation(5, 5, "E");
		
        pExplorer.turnRight();
		
		assertEquals("(5,5,S)", pExplorer.getCurrentLocation());
	}
	
}
