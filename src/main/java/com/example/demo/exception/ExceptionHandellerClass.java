package com.example.demo.exception;

import java.awt.print.Book;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandellerClass   {
	
	@ExceptionHandler(BookidNotFound.class)
	
	public ResponseEntity<Object> exception(BookidNotFound exception){
		return new ResponseEntity<>("Book Not Found",HttpStatus.NOT_FOUND);
	}
	

}
