package com.pp.service;

import java.util.List;
import java.util.Optional;

import javax.xml.crypto.Data;

import org.aspectj.weaver.patterns.IScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.dao.ITicketRepository;

import com.pp.exception.TouristNotFoundException;
import com.pp.pojo.Passenger;


import jakarta.persistence.Id;
@Service
public class TicketManagementImpl implements ITicketBookingService{
	@Autowired
ITicketRepository repo;

	@Override
	public Passenger registerPassenger(Passenger passenger) {
	
	
	
		return repo.save(passenger);
	
		
	}
	@Override
	public Passenger fetchPassengerById(Integer pid) {
		Optional<Passenger> optional = repo.findById(pid);
		Passenger passenger = optional.get();
		if(optional.isPresent())
		 return passenger;
		else
			throw new TouristNotFoundException(" unable to register passenger with id "+passenger.getPid());
	}
	
	
}

