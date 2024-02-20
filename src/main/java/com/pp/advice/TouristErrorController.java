package com.pp.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.pp.exception.TouristNotFoundException;

@RestControllerAdvice
public class TouristErrorController {
     @ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<?> handleExceptionForTourist(TouristNotFoundException e){
    	 System.out.println("Advice TouristExceptionHandler");
		ErrorDetails details=new ErrorDetails("404 Not Found", e.getMessage(), LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.BAD_REQUEST);
	}
     
     @ExceptionHandler(Exception.class)
 	public ResponseEntity<?> handleExceptionGlobally(TouristNotFoundException e){
     	 System.out.println("Advice TouristExceptionHandler");
 		ErrorDetails details=new ErrorDetails("404 Not Found", e.getMessage(), LocalDateTime.now());
 		return new ResponseEntity<ErrorDetails>(details,HttpStatus.INTERNAL_SERVER_ERROR);
 	}
}
