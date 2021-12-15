package com.ibm.academia.banrul.repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ibm.academia.banrul.entities.TarjetaCredito;

public interface TarjetaCreditoRepository extends CrudRepository<TarjetaCredito , Long>{

	@Query("select u from TarjetaCredito u where u.uso = upper(?1) and u.salarioMinimo<=?2 and salarioMaximo>=?2 and edadMinima<=?3 and edadMaxima>=?3")
	Iterable<TarjetaCredito> findByUsoSalarioEdad(String uso , Integer salario , Integer edad);
	
	@Query("select u.nombre from TarjetaCredito u where u.uso = upper(?1) and u.salarioMinimo<=?2 and salarioMaximo>=?2 and edadMinima<=?3 and edadMaxima>=?3")
	Set<String> findByUsoSalarioEdadNombre(String uso , Integer salario , Integer edad);
	
	@Query("select u from TarjetaCredito u where u.uso=upper(?1) ")
	Iterable<TarjetaCredito> findByUso(String uso);
	
	@Query("select u from TarjetaCredito u where u.salarioMinimo<=?1 and u.salarioMaximo>=?1")
	Iterable<TarjetaCredito> findBySalario(Integer salario);
	
	@Query("select u from TarjetaCredito u where u.edadMinima<=?1 and u.edadMaxima>=?1")
	Iterable<TarjetaCredito> findByEdad(Integer edad);
	
}
