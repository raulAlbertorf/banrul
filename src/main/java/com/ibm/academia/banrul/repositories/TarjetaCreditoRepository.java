package com.ibm.academia.banrul.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ibm.academia.banrul.entities.TarjetaCredito;

public interface TarjetaCreditoRepository extends JpaRepository<TarjetaCredito , Long>{

	@Query("select u from TarjetaCredito u where u.uso = ?1 and u.salarioMinimo<=?2 and salarioMaximo>=?2 and edadMinima<=?3 and edadMaxima>=?3")
	List<TarjetaCredito> findByUsoSalarioEdad(String uso , Integer salario , Integer edad);
	
	@Query("select u.nombre from TarjetaCredito u where u.uso = ?1 and u.salarioMinimo<=?2 and salarioMaximo>=?2 and edadMinima<=?3 and edadMaxima>=?3")
	List<String> findByUsoSalarioEdadNombre(String uso , Integer salario , Integer edad);
	
	@Query("select u from TarjetaCredito u where u.uso=?1 ")
	List<TarjetaCredito> findByUso(String uso);
	
	@Query("select u from TarjetaCredito u where u.salarioMinimo<=?1 and u.salarioMaximo>=?1")
	List<TarjetaCredito> findBySalarioMayor(Integer salario);
	
	@Query("select u from TarjetaCredito u where u.edadMinima<=?1 and u.edadMaxima>=?1")
	List<TarjetaCredito> findByEdad(Integer edad);
	
}
