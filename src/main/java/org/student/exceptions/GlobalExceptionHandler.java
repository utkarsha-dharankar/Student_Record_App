package org.student.exceptions;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice 
public class GlobalExceptionHandler {

	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<Object> handleException(HttpMessageNotReadableException ex)
	{
		Map<String , String> errorResponse=new HashMap<>();
		errorResponse.put("status", "failed");
		errorResponse.put("message", ex.getMessage());
		errorResponse.put("date", new Date().toString());
		
		System.out.println(errorResponse);
		
		return new ResponseEntity<Object>(errorResponse,HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleAllException(Exception ex)
	{
		Map<String , String> errorResponse=new HashMap<>();
		errorResponse.put("status", "failed");
		errorResponse.put("message", ex.getLocalizedMessage());
		errorResponse.put("date", new Date().toString());
		
		System.out.println(errorResponse);
		
		return new ResponseEntity<Object>(errorResponse,HttpStatus.BAD_REQUEST);
		
	}
}
