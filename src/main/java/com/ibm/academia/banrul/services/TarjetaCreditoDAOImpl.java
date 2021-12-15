package com.ibm.academia.banrul.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.banrul.entities.TarjetaCredito;
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
		// TODO Auto-generated method stub
		return repository.findByUsoSalarioEdad(uso, salario, edad);
	}

	@Override
	@Transactional(readOnly = true)
	public Set<String> findByUsoSalarioEdadNombre(String uso, Integer salario, Integer edad) {
		// TODO Auto-generated method stub
		return repository.findByUsoSalarioEdadNombre(uso, salario, edad);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<TarjetaCredito> findByUso(String uso) {
		// TODO Auto-generated method stub
		return repository.findByUso(uso);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<TarjetaCredito> findBySalario(Integer salario) {
		// TODO Auto-generated method stub
		return repository.findBySalario(salario);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<TarjetaCredito> findByEdad(Integer edad) {
		// TODO Auto-generated method stub
		return repository.findByEdad(edad);
	}

}
