package com.example.subcription;

import org.springframework.http.HttpStatus; 
import org.springframework.web.bind.annotation.ResponseStatus; 
 
@ResponseStatus(value = HttpStatus.BAD_REQUEST) 
public class BadRequestException {

	 private static final long serialVersionUID = 1L; 
	  
     public BadRequestException(String message) { 
         super(message); 
}
}