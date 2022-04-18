package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ShowRestControllerException {
	
	@ExceptionHandler(DeleteShowException.class)
	public ResponseEntity<?> handleDeleteException(DeleteShowException e,WebRequest req)
	{
		return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UpdateShowException.class)
	public ResponseEntity<?> handleUpdateException(UpdateShowException u,WebRequest req)
	{
		return new ResponseEntity<>(u.toString(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(GetShowException.class)
	public ResponseEntity<?> handleGetException(GetShowException g , WebRequest req)
	{
		return new ResponseEntity<>(g.toString(), HttpStatus.NOT_FOUND);
	}
	

	@ExceptionHandler(AddShowException.class)
	public ResponseEntity<?> handleAddException(AddShowException a , WebRequest req)
	{
		return new ResponseEntity<>(a.toString(), HttpStatus.NOT_FOUND);
	}
	

	@ExceptionHandler(AddShowLimitException.class)
	public ResponseEntity<?> handleAddLimitException(AddShowLimitException a , WebRequest req)
	{
		return new ResponseEntity<>(a.toString(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(FindAllException.class)
	public ResponseEntity<?> handleFindAllException(FindAllException f, WebRequest req)
	{
		return new ResponseEntity<>(f.toString(), HttpStatus.NOT_FOUND);
	}
}
