package com.pp.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Passenger {
	@Id
	
private Integer pid;
private String name;

private String departure;
private String arrival;

private String dateOfJourney;



@Override
public String toString() {
	return "Passenger [pid=" + pid + ", name=" + name + ", departure=" + departure + ", arrival=" + arrival
			+ ", dateOfJourney=" + dateOfJourney + "]";
}
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDeparture() {
	return departure;
}
public void setDeparture(String departure) {
	this.departure = departure;
}
public String getArrival() {
	return arrival;
}
public void setArrival(String arrival) {
	this.arrival = arrival;
}
public String getDateOfJourney() {
	return dateOfJourney;
}
public void setDateOfJourney(String dateOfJourney) {
	this.dateOfJourney = dateOfJourney;
}

public Passenger() {
	System.out.println("passenger instantiated");
}

}
