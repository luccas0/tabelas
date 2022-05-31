package com.fiap.luccas.exception;

public class CommitException extends Exception {
	
	public CommitException() {
		super("Erro ao realizar o commit");
	}
	
	public CommitException(String message) {
		super(message);
	}

}
