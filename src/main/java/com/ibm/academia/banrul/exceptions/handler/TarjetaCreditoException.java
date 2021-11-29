package com.ibm.academia.banrul.exceptions.handler;

public class TarjetaCreditoException extends RuntimeException {

	 public TarjetaCreditoException(Long id) {
	        super("Tarjeta no encontrada " + id);
	 }
	private static final long serialVersionUID = 1L;

}
