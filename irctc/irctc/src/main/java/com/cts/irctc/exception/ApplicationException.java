package com.cts.irctc.exception;

public class ApplicationException extends Exception {

	private static final long serialVersionUID = -9079454849611061074L;
	
	public ApplicationException() {
		super();
	}

	
	public ApplicationException(final String message) {
		super(message);
		
	}	
}
