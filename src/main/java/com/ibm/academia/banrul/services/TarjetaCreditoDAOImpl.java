package com.ibm.academia.banrul.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.banrul.exceptions.NotFoundException;
import com.ibm.academia.banrul.models.entities.TarjetaCredito;
import com.ibm.academia.banrul.repositories.TarjetaCreditoRepository;

@Service
public class TarjetaCreditoDAOImpl extends GenericoDAOImpl<TarjetaCredito, TarjetaCreditoRepository> implements TarjetaCreditoDAO{

	
	@Autowired
	public TarjetaCreditoDAOImpl(TarjetaCreditoRepository repository) {
		super(repository);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<TarjetaCredito> findByUsoSalarioEdad(String uso, Integer salario, Integer edad) {
		Iterable<TarjetaCredito> tarjetas = repository.findByUsoSalarioEdad(uso, salario, edad);
		if(((List<TarjetaCredito>)tarjetas).isEmpty()) {
			throw new NotFoundException(String.format("No contamos con una tarjeta adecuanda a tus necesidades: %s, salario: %d y edad: %d", uso,salario,edad));
		}
		return tarjetas;
	}

	@Override
	@Transactional(readOnly = true)
	public Set<String> findByUsoSalarioEdadNombre(String uso, Integer salario, Integer edad) {
		// TODO Auto-generated method stub
		Set<String> tarjetas = (Set<String>)repository.findByUsoSalarioEdadNombre(uso, salario, edad);
		if(tarjetas.isEmpty()) {
			throw new NotFoundException(String.format("No contamos con una tarjeta de credito adecuanda a tus necesidades: %s, salario: %d y edad: %d", uso,salario,edad));
		}
		return tarjetas;
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<TarjetaCredito> findByUso(String uso) {
		// TODO Auto-generated method stub
		Iterable<TarjetaCredito> tarjetasPorUso = repository.findByUso(uso);
		if(((List<TarjetaCredito>)tarjetasPorUso).isEmpty()) {
			throw new NotFoundException(String.format("No contamos con una tarjeta de credio adecuada para su uso: %s", uso));
		}
		return tarjetasPorUso;
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<TarjetaCredito> findBySalario(Integer salario) {
		// TODO Auto-generated method stub
		Iterable<TarjetaCredito> tarjetasPorSalario = repository.findBySalario(salario);
		if(((List<TarjetaCredito>)tarjetasPorSalario).isEmpty()) {
			throw new NotFoundException(String.format("No contamos con una tarjeta de credito adecuada a su salario: %d", salario));
		}
		return tarjetasPorSalario;
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<TarjetaCredito> findByEdad(Integer edad) {
		// TODO Auto-generated method stub
		Iterable<TarjetaCredito> tarjetasPorEdad = repository.findByEdad(edad);
		if(((List<TarjetaCredito>)tarjetasPorEdad).isEmpty()) {
			throw new NotFoundException(String.format("No contamos con una tarjeta de credito adecuada a su edad: %d", edad));
		}
		return tarjetasPorEdad;
	}

}
