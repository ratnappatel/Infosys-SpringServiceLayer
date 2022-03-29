package com.infy.exception;

// Custom Exception class to manage User-Friendly error messages to be sent/display
public class InfyBankException extends Exception {
	private static final long serialVersionUID = 1L;

	public InfyBankException(String message) {
		super(message);
	}
}
