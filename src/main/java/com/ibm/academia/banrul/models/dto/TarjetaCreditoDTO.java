package com.ibm.academia.banrul.models.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TarjetaCreditoDTO {


		private Long id;
		
		@NotEmpty(message = "No puede ser vacio")
		@NotNull(message = "No puede ser nulo")
		@Size(min = 2, max = 100)
		private String nombre;
		
		@NotEmpty(message = "No puede ser vacio")
		@NotNull(message = "No puede ser nulo")
		@Size(min = 2, max = 30)
		private String uso;
		
		@Positive(message = "Debe ser mayor a cero")
		private Integer salarioMinimo;
		
		@Positive(message = "Debe ser mayor a cero")
		private Integer salarioMaximo;
		
		@Positive(message = "Debe ser mayor a cero")
		private Integer edadMinima;
		
		@Positive(message = "Debe ser mayor a cero")
		private Integer edadMaxima;
		
}