package com.danielev86.procycling.controller.utility;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.danielev86.procycling.controller.dto.Response;

public class ResponseBuilder<T> {

	public  ResponseEntity<Response<T>> buildResponseEntity(boolean checkResponse, T bodyResponse){
		Response<T> response = new Response<T>();
		response.setCheckResponse(checkResponse);
		response.setBodyResponse(bodyResponse);
		
		return checkResponse 
				? new ResponseEntity<Response<T>>(response, HttpStatus.OK)
				: new ResponseEntity<Response<T>>(response, HttpStatus.NOT_FOUND);
		
	}
	
	
}
