package br.com.guisamp.rest_with_spring_boot_and_java_erudio.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationExceptione extends RuntimeException {
	
	public UnsuportedMathOperationExceptione(String msg) {
		super(msg);
	}
	
	private static final long serialVersionUID = 1L;
}