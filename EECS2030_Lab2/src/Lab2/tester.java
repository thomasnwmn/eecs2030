package Lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tester {

	@Test
	void sixPointTest() {
		int actualSpeed = 100;
		int maxSpeed = 50;
		boolean stuntDriving = false;
		
		assertEquals(6, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
		
		actualSpeed = 120;
		assertEquals(6, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
		
		stuntDriving = true;
		assertEquals(6, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
		
		actualSpeed = 100;
		assertEquals(6, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
		
		actualSpeed = 90;
		assertEquals(6, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
		
		actualSpeed = 80;
		assertEquals(6, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
		
		actualSpeed = 66;
		assertEquals(6, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
		
		actualSpeed = 65;
		assertEquals(6, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
		
		actualSpeed = 50;
		assertEquals(6, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
	}
	
	@Test
	void fourPointTest() {
		int actualSpeed = 99;
		int maxSpeed = 50;
		boolean stuntDriving = false;
		
		assertEquals(4, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
		
		actualSpeed = 90;
		assertEquals(4, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
		
		actualSpeed = 80;
		assertEquals(4, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
	}
	
	@Test
	void threePointTest() {
		int actualSpeed = 79;
		int maxSpeed = 50;
		boolean stuntDriving = false;
		
		assertEquals(3, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
		
		actualSpeed = 70;
		assertEquals(3, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
		
		actualSpeed = 66;
		assertEquals(3, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
	}
	
	@Test
	void ZeroPointTest() {
		int actualSpeed = 65;
		int maxSpeed = 50;
		boolean stuntDriving = false;
		
		assertEquals(0, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
		
		actualSpeed = 60;
		assertEquals(0, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
		
		actualSpeed = 50;
		assertEquals(0, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
	}

	@Test
	void invalidTest() {
		int actualSpeed = 49;
		int maxSpeed = 50;
		boolean stuntDriving = false;

		assertEquals(-1, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));

		actualSpeed = -1;
		assertEquals(-1, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
		
		maxSpeed = -1;
		assertEquals(-1, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));

		actualSpeed = 0;
		assertEquals(-1, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving));
	}

}
