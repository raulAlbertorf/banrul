package com.ibm.academia.banrul.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre;
	
	@Column(name = "uso")
	private String uso;
	
	@Column(name = "salario_minimo")
	private Integer salarioMinimo;
	
	@Column(name = "salario_maximo")
	private Integer salarioMaximo;
	
	@Column(name = "edad_minima")
	private Integer edadMinima;
	
	@Column(name = "edad_maxima")
	private Integer edadMaxima;
	
	@Column(name = "fecha_alta")
	private Date fechaAlta;
	
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	
	
	public TarjetaCredito(String nombre , String uso , Integer salarioMinimo , Integer salarioMaximo , Integer edadMinima , 
			Integer edadMaxima) {
		this.nombre = nombre;
		this.uso = uso;
		this.salarioMinimo = salarioMinimo;
		this.salarioMaximo = salarioMaximo;
		this.edadMinima = edadMinima;
		this.edadMaxima = edadMaxima;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edadMaxima, edadMinima, id, nombre, salarioMaximo, salarioMinimo, uso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TarjetaCredito other = (TarjetaCredito) obj;
		return Objects.equals(edadMaxima, other.edadMaxima) && Objects.equals(edadMinima, other.edadMinima)
				&& Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(salarioMaximo, other.salarioMaximo)
				&& Objects.equals(salarioMinimo, other.salarioMinimo) && Objects.equals(uso, other.uso);
	}
	
	@PrePersist
	private void antesPersistir()
	{
		this.fechaAlta = new Date();
	}
	
	@PreUpdate
	private void antesActualizar()
	{
		this.fechaModificacion = new Date();
	}
	
}
