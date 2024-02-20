package com.pp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pp.pojo.Passenger;

@Repository
public interface ITicketRepository extends JpaRepository<Passenger,Integer> {

}
