package com.residencia.t2m.exceptions;

public class NoSuchElementFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NoSuchElementFoundException(String message) {
		super(message);
	}
}