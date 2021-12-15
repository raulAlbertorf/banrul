package com.ibm.academia.banrul.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.ibm.academia.banrul.datos.DatosDummy;
import com.ibm.academia.banrul.entities.TarjetaCredito;
import com.ibm.academia.banrul.repositories.TarjetaCreditoRepository;

@DataJpaTest
public class TarjetaCreditoRepositoryTest {

	@Autowired
	TarjetaCreditoRepository tarjetaCreditoRepository;
	
	@BeforeEach
	void setUp() {
		tarjetaCreditoRepository.save(DatosDummy.tarjetaCredito01());
		tarjetaCreditoRepository.save(DatosDummy.tarjetaCreditoShopping01());
		tarjetaCreditoRepository.save(DatosDummy.tarjetaCreditoShopping02());
		tarjetaCreditoRepository.save(DatosDummy.tarjetaCreditoShopping03());
		tarjetaCreditoRepository.save(DatosDummy.tarjetaCreditoShopping04());
		tarjetaCreditoRepository.save(DatosDummy.tarjetaCreditoShopping05());
		tarjetaCreditoRepository.save(DatosDummy.tarjetaCreditoShopping06());
	}
	
	@AfterEach
	void tearDown() {
		tarjetaCreditoRepository.deleteAll();
	}

	@Test
	@DisplayName("Buscar detalle en tarjetas de credito aplicables por Uso, Salario y Edad")
	void findByUsoSalarioEdad() {
		// Given
		String uso = "travels";
		Integer salario = 12000;
		Integer edad = 35;

		List<TarjetaCredito> expected = (List<TarjetaCredito>) tarjetaCreditoRepository.findByUsoSalarioEdad(uso,
				salario, edad);

		// then
		assertThat(expected.size()).isEqualTo(1);
	}

	@Test
	@DisplayName("Buscar nombre de tarjetas de credito aplicables por Uso, Salario y Edad")
	void findByUsoSalarioEdadNombre() {
		String uso = "shoPPing";
		Integer salario = 25000;
		Integer edad = 24;

		List<TarjetaCredito> expected = (List<TarjetaCredito>) tarjetaCreditoRepository.findByUsoSalarioEdad(uso,
				salario, edad);

		// then
		assertThat(expected.size()).isEqualTo(6);
	}

	@Test
	@DisplayName("Buscar tarjetas de credito aplicables por Uso")
	void findByUso() {
		String uso = "ShoPPing";
		
		List<TarjetaCredito> expected = (List<TarjetaCredito>) tarjetaCreditoRepository.findByUso(uso);

		// then
		assertThat(expected.size()).isEqualTo(6);
	}

	@Test
	@DisplayName("Buscar tarjetas de credito aplicables por Salario")
	void findBySalario() {
		Integer salario = 12000;
		
		List<TarjetaCredito> expected = (List<TarjetaCredito>) tarjetaCreditoRepository.findBySalario(salario);

		// then
		assertThat(expected.size()).isEqualTo(1);
	}

	@Test
	@DisplayName("Buscar tarjetas de credito aplicables Edad")
	void findByEdad() {
		Integer edad = 12;
		
		List<TarjetaCredito> expected = (List<TarjetaCredito>) tarjetaCreditoRepository.findByEdad(edad);

		// then
		assertThat(expected.size()).isEqualTo(0);
	}
}
