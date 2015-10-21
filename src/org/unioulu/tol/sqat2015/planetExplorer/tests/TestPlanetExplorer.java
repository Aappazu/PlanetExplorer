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
		
        pExplorer.turnRight();
		
		assertEquals("(5,5,S)", pExplorer.getCurrentLocation());
	}
	
	@Test
	public void moveForwardFromZeroZeroSouth(){
		
		PlanetExplorer pExplorer = new PlanetExplorer(10,10);
		
		pExplorer.setLocation(0, 0, "S");
		
		pExplorer.moveForward();
		
		assertEquals("(0,1,S)", pExplorer.getCurrentLocation());
		
	}
	
	@Test
	public void moveForwardFromMaxYSouth(){
		
		PlanetExplorer pExplorer = new PlanetExplorer(10,10);
		
		pExplorer.setLocation(0, 9, "S");
		
		pExplorer.moveForward();
		
		assertEquals("(0,9,S)", pExplorer.getCurrentLocation());
		
	}
	
	@Test
	public void moveForwardFromMaxYMinusOneSouth(){
		
		PlanetExplorer pExplorer = new PlanetExplorer(10,10);
		
		pExplorer.setLocation(0, 8, "S");
		
		pExplorer.moveForward();
		
		assertEquals("(0,9,S)", pExplorer.getCurrentLocation());
		
	}
	
	@Test
	public void moveForwardFromZeroZeroEast(){
		
		PlanetExplorer pExplorer = new PlanetExplorer(10,10);
		
		pExplorer.setLocation(0, 0, "E");
		
		pExplorer.moveForward();
		
		assertEquals("(1,0,E)", pExplorer.getCurrentLocation());
		
	}
	
	@Test
	public void moveForwardFromMaxXEast(){
		
		PlanetExplorer pExplorer = new PlanetExplorer(10,10);
		
		pExplorer.setLocation(9, 0, "E");
		
		pExplorer.moveForward();
		
		assertEquals("(9,0,E)", pExplorer.getCurrentLocation());
		
	}
	
}
