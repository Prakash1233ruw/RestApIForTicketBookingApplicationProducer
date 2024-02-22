package com.pp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Ticket Booking API", 
                  version = "1.0",
                  description = "AN API to Book a Ticket"),
                  servers = @Server(url = "http://localhost:8787/TicketBookingApp",
          				            description = " This API URL will help to book ticket"))
public class SpringRestApiTicketBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiTicketBookingApplication.class, args);
	}

}
