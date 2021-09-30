package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Booking.Booking;
import service.AdminService;
import service.BookingService;
import service.FlightService;

@RestController("api/v1.0/flight/")
public class FlightController {

	@Autowired
	BookingService bookingService;
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	FlightService flightService;
	
	@PostMapping("airline/register")
	public void newBooking(@RequestBody Booking booking) {
		
		bookingService.saveBooking(booking);;
		System.out.println("Booking created successfully");

	}
	
	
	@PostMapping("admin/login")
	public void adminLogin() {
		
		adminService.adminLogin();
	}
	
	
	@PostMapping("airline/inventory/add")
	public void addInvetory(@PathVariable int flightNo) {
		if(flightService.searchFlight(flightNo))
	}
	
	
	@PostMapping("flight/search")
	public void search() {
		
	}
	
	
	@PostMapping("booking/{flightd}")
	public void bookTicket() {
		
	}
	
	@GetMapping("ticket/{pnr}")
	public void getTicketFromPnr() {
		
	}
	
	@GetMapping("booking/history/{emailid}")
	public void getTicketHistoryBasedOnEmail() {
		
	}
	
	@DeleteMapping("booking/cancel/{pnr}")
	public void cancelTicket() {
		
	}
}
