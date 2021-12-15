package com.ibm.academia.banrul.controllers;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.banrul.exceptions.NotFoundException;
import com.ibm.academia.banrul.mapper.TarjetaCreditoMapper;
import com.ibm.academia.banrul.models.dto.TarjetaCreditoDTO;
import com.ibm.academia.banrul.models.entities.TarjetaCredito;
import com.ibm.academia.banrul.services.TarjetaCreditoDAO;

@RestController
@RequestMapping("/credito")
public class TarjetaCreditoController {
	
	Logger logger = LoggerFactory.getLogger(TarjetaCreditoController.class);
	
	@Autowired
	private TarjetaCreditoDAO tarjetaCreditoDAO;
	
	/**
	 * Endpoint para buscar todas las tarjetas de credito
	 * @return Una objeto List de tipo TarjetaCredito
	 * @NotFoundException - En caso de no existir ninguna tarjeta de credito
	 * @author RaulRF - 14/12/2021
	 */
	@GetMapping("/listar/todas")
    public ResponseEntity<?> buscarTodas(){
		
		List<TarjetaCreditoDTO> tarCreditoDTOs = null;
		try{ 
			List<TarjetaCredito> tarjetasCredito =  (List<TarjetaCredito>) tarjetaCreditoDAO.buscarTodos();
			tarCreditoDTOs = tarjetasCredito.stream()
					.map(TarjetaCreditoMapper::mapTarjetaCredito)
					.collect(Collectors.toList());
			
		}catch (NotFoundException e) {
			logger.error("Buscar todas las tarjetas de credito : - "+e.getMessage());
		}
        return new ResponseEntity<List<TarjetaCreditoDTO>>(tarCreditoDTOs, HttpStatus.OK);
    }
	
	/**
	 * Endpoint para buscar Tarjetas de Credito aplicables para el uso, salario y edad
	 * @param uso Proposito de tarjeta de credito
	 * @param salario Ingreso del cliente mensual
	 * @param edad Edad del cliente
	 * @return Lista de Tarjetas de Credito aplicables para las condiciones del cliente
	 * @NotFoundException - En caso de no existir ninguna tarjeta de credito adecuada al cliente
	 * @author RaulRF - 14/12/2021
	 */
	@GetMapping("/aplicable/detalle")
	public ResponseEntity<?> aplicablePorUsoSalarioEdad(@RequestParam String uso, 
																		@RequestParam Integer salario, 
																		@RequestParam Integer edad){
		List<TarjetaCredito> tarjetasAplicables = null;
		try {
			tarjetasAplicables = (List<TarjetaCredito>) tarjetaCreditoDAO.findByUsoSalarioEdad(uso.toUpperCase() , salario , edad);	
		}catch (NullPointerException e) {
			logger.error("Aplicables por Uso - Salario - Edad : "+e.getMessage());
		}
		
		return new ResponseEntity<List<TarjetaCredito>>(tarjetasAplicables, HttpStatus.OK); 
		
	}
	
	/**
	 * Endpoint para buscar Nombres de Tarjetas de Credito aplicables para el uso, salario y edad del cliente
	 * @param uso Proposito de la Tarjeta de Credito
	 * @param salario Ingreso del cliente mensual
	 * @param edad Edad actual del cliente
	 * @return Lista de Nombres de Tarjetas de Credito aplicables a las condiciones del cliente
	 */
	@GetMapping("/aplicable/nombre")
	public ResponseEntity<?> aplicablePorUsoSalarioEdadNombre(@RequestParam String uso , @RequestParam Integer salario , @RequestParam Integer edad){
		
		Set<String> tarjetasAplicables = null;
		try {
			tarjetasAplicables = tarjetaCreditoDAO.findByUsoSalarioEdadNombre(uso.toUpperCase() , salario , edad);			
		}catch (NullPointerException e) {
			logger.error("Aplicables por Uso - Salario - Edad (Solo Nombres): "+e.getMessage());
		}		
		return new ResponseEntity<Set<String>>(tarjetasAplicables, HttpStatus.OK);
	}

}
