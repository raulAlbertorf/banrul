package com.ibm.academia.banrul.exceptions;

public class BadRequestException extends RuntimeException{

	public BadRequestException(String mensaje) {
		super(mensaje);
	}
	private static final long serialVersionUID = -5052605407006017645L;

}
