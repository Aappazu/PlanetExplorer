package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.*;

public class TestPlanetExplorer {

	@Test
	public void landingCompleted() {
		PlanetExplorer pExplorer = new PlanetExplorer(100,100);
		
		assertEquals("(0,0,N)", pExplorer.land());
	}
}
