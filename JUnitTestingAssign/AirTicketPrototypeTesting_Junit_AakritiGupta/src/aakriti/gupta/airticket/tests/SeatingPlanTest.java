package aakriti.gupta.airticket.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cc.airline.ticketing.SeatingPlan;

public class SeatingPlanTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println(
				"Starting test of the SeatingPlan default constructor: setUpBeforeClass()");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println(
				"Starting test of the SeatingPlan default constructor: setUpBeforeClass():tearDownAfterClass()");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println(
				"Starting test of the SeatingPlan default constructor: setUpBeforeClass(): setUp()");
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println(
				"Starting test of the SeatingPlan default constructor: setUpBeforeClass(): tearDown()");
	}

	@Test
	public void testSeatingPlan() {
		//fail("Not yet implemented");
		SeatingPlan sp = new SeatingPlan();
		assertNotNull(sp);
		
		int actualNumBusiSeats = sp.getNumBusSeats();
		int actualNumRows = sp.getTotalRows();
		int actualNumTotalSeats = sp.getTotalSeats();
		
		int expectedNumBusiSeats = 2;
		int expectedNumRows = 4;
		int expectedNumTotalSeats = 14;
		
		assertEquals(expectedNumBusiSeats,actualNumBusiSeats);
		assertEquals(expectedNumRows,actualNumRows);
		assertEquals(expectedNumTotalSeats,actualNumTotalSeats);
		
	}

}
