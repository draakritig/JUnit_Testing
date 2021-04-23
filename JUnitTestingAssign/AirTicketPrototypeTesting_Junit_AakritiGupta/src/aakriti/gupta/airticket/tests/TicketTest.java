package aakriti.gupta.airticket.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cc.airline.passengers.Passenger;
import com.cc.airline.passengers.PassengerName;
import com.cc.airline.ticketing.Seat;
import com.cc.airline.ticketing.Ticket;

public class TicketTest {

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
	public void testTicket() {
		//fail("Not yet implemented");
		PassengerName passName = new PassengerName("Samantha", "Luke", "Suzanne");
		Passenger passenger = new Passenger(passName);
		
		Seat seat = new Seat();
		seat.setRow(4);
		seat.setLetter('B');
		
		Ticket ticket = new Ticket(passenger, seat, 600);
		assertTrue(ticket.getTicketNo() > 1000000 );	
	}
	
	@Test( expected=Exception.class)
	public void testTicketBad() {
	Ticket ticket = new Ticket(null, new Seat(), -100);
	assertTrue(ticket.getTicketNo() > 1000000 );
	}

}
