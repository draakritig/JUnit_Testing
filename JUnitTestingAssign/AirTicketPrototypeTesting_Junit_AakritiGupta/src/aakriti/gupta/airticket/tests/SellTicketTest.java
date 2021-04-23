package aakriti.gupta.airticket.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cc.airline.passengers.Passenger;
import com.cc.airline.passengers.PassengerName;
import com.cc.airline.passengers.StaffPassenger;
import com.cc.airline.ticketing.Seat;
import com.cc.airline.ticketing.SeatingClass;
import com.cc.airline.ticketing.Ticket;

public class SellTicketTest {

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
	public void test() {
		//fail("Not yet implemented");
	}
	@Test
	public void sellTicket1() {
	SeatingClass sClass = SeatingClass.ECONOMY;
	Passenger passenger = new Passenger(
	new PassengerName("Mary", "I", "Worth"));
	Seat seat = new Seat();
	seat.setRow(3); seat.setLetter('D');
	double price = sClass.getPrice();
	Ticket ticket = new Ticket(passenger, seat, price);
	System.out.println("Ticket issued: " + ticket);
	assertEquals(ticket.getPrice(), 500.0, 0.005 );
	}

	@Test
	public void sellTicket2() {
	SeatingClass sClass = SeatingClass.ECONOMY;
	PassengerName passengerName = new PassengerName("Sam", "T", "Frank");
	StaffPassenger staff = new StaffPassenger(passengerName,"EMP456");
	Seat seat = new Seat();
	seat.setRow(3); seat.setLetter('B');
	double price = sClass.getPrice();
	Ticket ticket = new Ticket(staff, seat, price);
	System.out.println("Ticket issued: " + ticket);
	assertEquals(ticket.getPrice(), 250.0, 0.005 );
	}
	@Test
	public void sellTicket3() {
	SeatingClass sClass = SeatingClass.BUSINESS;
	PassengerName passengerName1 = new PassengerName("Mary", "I", "Worth");
	StaffPassenger staff = new StaffPassenger(passengerName1,"EMP890");
	Seat seat = new Seat();
	seat.setRow(1); seat.setLetter('B');
	double price = sClass.getPrice();
	Ticket ticket = new Ticket(staff, seat, price);
	System.out.println("Ticket issued: " + ticket);
	assertEquals(ticket.getPrice(), 750.0, 0.005 );
	}
}
