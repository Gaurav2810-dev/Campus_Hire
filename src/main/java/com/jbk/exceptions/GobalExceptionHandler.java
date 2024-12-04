package com.jbk.exceptions;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jbk.dto.ExceptionResponse;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	 public HashMap<String, String> InvalidInput(MethodArgumentNotValidException ex)
	 {
		HashMap<String, String>error=new HashMap<String, String>();
		List<FieldError>fielderror=ex.getFieldErrors();
		for (FieldError fieldError2 : fielderror) {
			error.put(fieldError2.getField(),fieldError2.getDefaultMessage());
		}
		return error;
		 
	 }
	@ExceptionHandler(ResourceNotFoundException.class)
	public ExceptionResponse  resourceNotFoundException(ResourceNotFoundException ex, HttpServletRequest request)
	{
		ExceptionResponse response=new ExceptionResponse();
		response.setMessage(ex.getMessage());
		response.setPath(request.getRequestURI().toString());
		response.setTimestamp(new Timestamp(System.currentTimeMillis()));
		
		return  response;
		
	}
	

}
