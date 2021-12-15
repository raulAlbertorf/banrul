package com.ibm.academia.banrul.repository.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ibm.academia.banrul.datos.DatosDummy;
import com.ibm.academia.banrul.entities.TarjetaCredito;
import com.ibm.academia.banrul.repositories.TarjetaCreditoRepository;
import com.ibm.academia.banrul.services.TarjetaCreditoDAO;
import com.ibm.academia.banrul.services.TarjetaCreditoDAOImpl;

public class TarjetaCreditoDAOImplTest {

	TarjetaCreditoDAO tarjetaCreditoDAO;
	TarjetaCreditoRepository tarjetaCreditoRepository;

	@BeforeEach
	void setUp() {
		tarjetaCreditoRepository = mock(TarjetaCreditoRepository.class);
		tarjetaCreditoDAO = new TarjetaCreditoDAOImpl(tarjetaCreditoRepository);
	}

	@Test
	@DisplayName("Buscar detalle en tarjetas de credito aplicables por Uso, Salario y Edad")
	void findByUsoSalarioEdad() {
		String uso = "travels";
		Integer salario = 12000;
		Integer edad = 35;
		when(tarjetaCreditoRepository.findByUsoSalarioEdad(uso, salario, edad))
				.thenReturn(Arrays.asList(DatosDummy.tarjetaCredito01()));

		// When
		List<TarjetaCredito> expected = (List<TarjetaCredito>) tarjetaCreditoDAO.findByUsoSalarioEdad(uso, salario,
				edad);

		// Then
		assertThat(expected.size()).isEqualTo(1);
		assertThat(expected.get(0)).isEqualTo(DatosDummy.tarjetaCredito01());

		verify(tarjetaCreditoRepository).findByUsoSalarioEdad(uso, salario, edad);
	}

	@Test
	@DisplayName("Buscar nombre de tarjetas de credito aplicables por Uso, Salario y Edad")
	void findByUsoSalarioEdadNombre() {
		String uso = "shoPPing";
		Integer salario = 25000;
		Integer edad = 24;
		when((Set<String>) tarjetaCreditoRepository.findByUsoSalarioEdadNombre(uso, salario, edad))
				.thenReturn(new HashSet<String>(Arrays.asList(DatosDummy.tarjetaCreditoShopping01().getNombre(),
						DatosDummy.tarjetaCreditoShopping02().getNombre(),
						DatosDummy.tarjetaCreditoShopping03().getNombre(),
						DatosDummy.tarjetaCreditoShopping04().getNombre(),
						DatosDummy.tarjetaCreditoShopping05().getNombre(),
						DatosDummy.tarjetaCreditoShopping06().getNombre())));

		// When
		Set<String> expected = tarjetaCreditoDAO.findByUsoSalarioEdadNombre(uso, salario, edad);

		// Then
		assertThat(expected.size()).isEqualTo(6);
		assertThat(expected.contains(DatosDummy.tarjetaCreditoShopping01().getNombre())).isTrue();
		assertThat(expected.contains(DatosDummy.tarjetaCreditoShopping02().getNombre())).isTrue();
		assertThat(expected.contains(DatosDummy.tarjetaCreditoShopping03().getNombre())).isTrue();
		assertThat(expected.contains(DatosDummy.tarjetaCreditoShopping04().getNombre())).isTrue();
		assertThat(expected.contains(DatosDummy.tarjetaCreditoShopping05().getNombre())).isTrue();
		assertThat(expected.contains(DatosDummy.tarjetaCreditoShopping06().getNombre())).isTrue();

		verify(tarjetaCreditoRepository).findByUsoSalarioEdadNombre(uso, salario, edad);
	}

	@Test
	@DisplayName("Buscar tarjetas de credito aplicables por Uso")
	void findByUso() {
		String uso = "ShoPPing";
		when(tarjetaCreditoRepository.findByUso(uso))
				.thenReturn(Arrays.asList(DatosDummy.tarjetaCreditoShopping01(), DatosDummy.tarjetaCreditoShopping02(),
						DatosDummy.tarjetaCreditoShopping03(), DatosDummy.tarjetaCreditoShopping04(),
						DatosDummy.tarjetaCreditoShopping05(), DatosDummy.tarjetaCreditoShopping06()));

		List<TarjetaCredito> expected = (List<TarjetaCredito>) tarjetaCreditoRepository.findByUso(uso);

		assertThat(expected.size()).isEqualTo(6);
		assertThat(expected.get(5)).isInstanceOf(TarjetaCredito.class);
		assertThat(expected.get(5)).isEqualTo(DatosDummy.tarjetaCreditoShopping06());

		verify(tarjetaCreditoRepository).findByUso(uso);
	}

	@Test
	@DisplayName("Buscar tarjetas de credito aplicables por Salario")
	void findBySalario() {
		Integer salario = 12000;
		when(tarjetaCreditoRepository.findBySalario(salario)).thenReturn(Arrays.asList(DatosDummy.tarjetaCredito01()));

		List<TarjetaCredito> expected = (List<TarjetaCredito>) tarjetaCreditoRepository.findBySalario(salario);

		assertThat(expected.size()).isEqualTo(1);
		assertThat(expected.get(0)).isInstanceOf(TarjetaCredito.class);
		assertThat(expected.get(0)).isEqualTo(DatosDummy.tarjetaCredito01());

		verify(tarjetaCreditoRepository).findBySalario(salario);
	}

	@Test
	@DisplayName("Buscar tarjetas de credito aplicables Edad")
	void findByEdad() {
		Integer edad = 10;
		when(tarjetaCreditoRepository.findByEdad(edad)).thenReturn(Arrays.asList());

		List<TarjetaCredito> expected = (List<TarjetaCredito>) tarjetaCreditoRepository.findByEdad(edad);

		assertThat(expected.size()).isEqualTo(0);

		verify(tarjetaCreditoRepository).findByEdad(edad);
	}

}
