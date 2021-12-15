package com.ibm.academia.banrul.exceptions;

public class NotFoundException extends RuntimeException {

	public NotFoundException(String mensaje) {
		super(mensaje);
	}
	private static final long serialVersionUID = -3490522437502025229L;
}
