package com.ibm.academia.banrul.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.academia.banrul.entities.TarjetaCredito;
import com.ibm.academia.banrul.repositories.TarjetaCreditoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TarjetaCreditoService {

	@Autowired
	private final TarjetaCreditoRepository repository;

	public List<TarjetaCredito> consultarTodas() {

		return repository.findAll();

	}

	public List<TarjetaCredito> consultarTarjetasCredito(String uso , Integer salario , Integer edad) {

		return repository.findByUsoSalarioEdad(uso , salario , edad);

	}

	public List<String> consultarTarjetasCreditoTipo(String uso , Integer salario , Integer edad) {

		return repository.findByUsoSalarioEdadNombre(uso , salario , edad);

	}

	public List<TarjetaCredito> consultarUso(String uso) {

		return repository.findByUso(uso);

	}

	public List<TarjetaCredito> consultarSalario(Integer salario) {

		return repository.findBySalarioMayor(salario);

	}

	public List<TarjetaCredito> consultarEdad(Integer edad) {

		return repository.findByEdad(edad);

	}

}
