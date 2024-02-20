package com.pp.service;

import java.util.List;

import com.pp.pojo.Passenger;

public interface ITicketBookingService {
public Passenger registerPassenger(Passenger passenger);
public Passenger  fetchPassengerById(Integer pid);


}
