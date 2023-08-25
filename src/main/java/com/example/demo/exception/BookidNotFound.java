package com.example.demo.exception;

public class BookidNotFound extends RuntimeException {
	
	public BookidNotFound(String msg) {
		
		super (msg);
	}

}
