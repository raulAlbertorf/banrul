package com.ibm.academia.banrul.services;

import java.util.Set;

import com.ibm.academia.banrul.entities.TarjetaCredito;

public interface TarjetaCreditoDAO extends GenericoDAO<TarjetaCredito>{
	public Iterable<TarjetaCredito> findByUsoSalarioEdad(String uso , Integer salario , Integer edad);
	public Set<String> findByUsoSalarioEdadNombre(String uso , Integer salario , Integer edad);
	public Iterable<TarjetaCredito> findByUso(String uso);
	public Iterable<TarjetaCredito> findBySalario(Integer salario);
	public Iterable<TarjetaCredito> findByEdad(Integer edad);
}
