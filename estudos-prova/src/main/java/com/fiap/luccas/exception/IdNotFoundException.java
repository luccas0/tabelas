package com.fiap.luccas.exception;

public class IdNotFoundException extends Exception {
	
	public IdNotFoundException() {
		super("Id n�o encontrado");
	}

	public IdNotFoundException(String message) {
		super(message);
	}

}
