package com.ibm.academia.banrul.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class TarjetaCredito {

	@Id @GeneratedValue
	private Long id;
	private String nombre;
	private String uso;
	private Integer salarioMinimo;
	private Integer salarioMaximo;
	private Integer edadMinima;
	private Integer edadMaxima;
	
	
	public TarjetaCredito(String nombre , String uso , Integer salarioMinimo , Integer salarioMaximo , Integer edadMinima , 
			Integer edadMaxima) {
		this.nombre = nombre;
		this.uso = uso;
		this.salarioMinimo = salarioMinimo;
		this.salarioMaximo = salarioMaximo;
		this.edadMinima = edadMinima;
		this.edadMaxima = edadMaxima;
	}
	
}
