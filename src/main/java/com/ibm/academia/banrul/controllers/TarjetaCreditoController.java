package com.ibm.academia.banrul.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.banrul.entities.TarjetaCredito;
import com.ibm.academia.banrul.exceptions.NotFoundException;
import com.ibm.academia.banrul.services.TarjetaCreditoDAO;

@RestController
@RequestMapping("/credito")
public class TarjetaCreditoController {
	
	@Autowired
	private TarjetaCreditoDAO tarjetaCreditoDAO;
	
	@GetMapping("/listar/todas")
    public ResponseEntity<?> buscarTodas(){
		//log.info("Consulta todas las tarjetas de credito");
		List<TarjetaCredito> tarjetasCredito =  (List<TarjetaCredito>) tarjetaCreditoDAO.buscarTodos();
		if(tarjetasCredito.isEmpty()){
			throw new NotFoundException("No se tienen tarjetas de credito");
		}
        return new ResponseEntity<List<TarjetaCredito>>(tarjetasCredito, HttpStatus.OK);
    }
	
	@GetMapping("/aplicable/detalle")
	public ResponseEntity<?> aplicablePorUsoSalarioEdad(@RequestParam String uso, 
																		@RequestParam Integer salario, 
																		@RequestParam Integer edad){
		List<TarjetaCredito> tarjetasAplicables = (List<TarjetaCredito>) tarjetaCreditoDAO.findByUsoSalarioEdad(uso.toUpperCase() , salario , edad);
		if(tarjetasAplicables.isEmpty()) {
			throw new NotFoundException(String.format("No contamos con una tarjeta adecuanda a tus necesidades: %s, salario: %d y edad: %d", uso,salario,edad));
		}
		
		return new ResponseEntity<List<TarjetaCredito>>(tarjetasAplicables, HttpStatus.OK); 
		
	}
	
	@GetMapping("/aplicable/nombre")
	public ResponseEntity<?> aplicablePorUsoSalarioEdadNombre(@RequestParam String uso , @RequestParam Integer salario , @RequestParam Integer edad){
		Set<String> tarjetasAplicables = tarjetaCreditoDAO.findByUsoSalarioEdadNombre(uso.toUpperCase() , salario , edad);
		if(tarjetasAplicables.isEmpty()) {
			throw new NotFoundException(String.format("No contamos con una tarjeta adecuanda a tus necesidades: %s, salario: %d y edad: %d", uso,salario,edad));
		}
		
		return new ResponseEntity<Set<String>>(tarjetasAplicables, HttpStatus.OK); 
	}	

}
