package com.bookapp.exceptions;

public class DataAccessException extends RuntimeException {
	public DataAccessException(String message) {
		super(message);
	}
}
