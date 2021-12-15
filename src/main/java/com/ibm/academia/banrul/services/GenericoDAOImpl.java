package com.ibm.academia.banrul.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.banrul.exceptions.NotFoundException;

public class GenericoDAOImpl<E, R extends CrudRepository<E, Long>> implements GenericoDAO<E> {

	protected final R repository;

	public GenericoDAOImpl(R repository) {
		this.repository = repository;
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<E> buscarPorId(Long id) {
		return repository.findById(id);
	}

	@Override
	@Transactional
	public E guardar(E entidad) {
		return repository.save(entidad);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<E> buscarTodos() {
		Iterable<E> entidades = repository.findAll();
		if(((List<E>)entidades).isEmpty()){
			throw new NotFoundException(String.format("No se tienen registros"));
		}
		return entidades;
	}

	@Override
	@Transactional
	public void eliminarPorId(Long id) {
		repository.deleteById(id);
	}

}
