package com.pp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pp.exception.TouristNotFoundException;
import com.pp.idgenerater.RandomIDGenerator;
import com.pp.pojo.Passenger;
import com.pp.pojo.Ticket;
import com.pp.service.ITicketBookingService;

import jakarta.websocket.server.PathParam;




@RestController
@RequestMapping("/api")
public class TouristController {
	@Autowired
	private ITicketBookingService service;
	@PostMapping("/getTicketNumber")
	public ResponseEntity<Ticket> entrollPassenger(@RequestBody Passenger passenger) {
		Passenger pas = service.registerPassenger(passenger);
	   Ticket ticket=new Ticket();
	   ticket.setTicketNumber(pas.getPid());
	   return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
	   
	}
	
	@GetMapping("/getPassengerTicket/{ticketNumber}")
	public ResponseEntity<Ticket> getPassengerInTicket(@PathVariable Integer ticketNumber) {
		Passenger passenger = service.fetchPassengerById(ticketNumber);
	   Ticket ticket=new Ticket();
	   ticket.setTicketNumber(ticketNumber);
	   ticket.setName(passenger.getName());
	   ticket.setArrival(passenger.getArrival());
	   ticket.setDeparture(passenger.getDeparture());
	   ticket.setStatus("confirmed");
	   ticket.setDateOfJourney(passenger.getDateOfJourney());
	   
	   return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
	   
	}
}

