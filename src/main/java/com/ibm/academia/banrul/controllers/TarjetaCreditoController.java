package com.ibm.academia.banrul.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.banrul.entities.TarjetaCredito;
import com.ibm.academia.banrul.services.TarjetaCreditoService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class TarjetaCreditoController {
	
	private static final Logger log = LoggerFactory.getLogger(TarjetaCreditoController.class);
	private final TarjetaCreditoService service;
	
	@GetMapping("/tarjetascredito")
    public List<TarjetaCredito> all(){
		log.info("Consulta todas las tarjetas de credito");
        return service.consultarTodas();
    }
	
	@GetMapping("/tarjetascredito/detalle")
    public ResponseEntity<List<TarjetaCredito>> aplicableUsoSalarioEdad(@RequestParam String uso , @RequestParam Integer salario , @RequestParam Integer edad){
		log.info("Tarjetas aplicables: ["+uso.toUpperCase()+" , "+salario+" , "+edad+"]");
        List<TarjetaCredito> tarjetas = service.consultarTarjetasCredito(uso.toUpperCase() , salario , edad);
		if(tarjetas.size()>0){
			return ResponseEntity.ok(tarjetas);
		}else {
			return ResponseEntity.noContent().build();
		}
    }
	
	@GetMapping("/tarjetascredito/tipo")
    public ResponseEntity<List<String>> aplicableUsoSalarioEdadTipo(@RequestParam String uso , @RequestParam Integer salario , @RequestParam Integer edad){
		log.info("Tarjetas aplicables: ["+uso.toUpperCase()+" , "+salario+" , "+edad+"]");
		List<String> tarjetas = service.consultarTarjetasCreditoTipo(uso.toUpperCase() , salario , edad);
		if(tarjetas.size()>0){
			return ResponseEntity.ok(tarjetas);
		}else {
			return ResponseEntity.noContent().build();
		}
    }
	
	@GetMapping("/tarjetascredito/uso")
	public List<TarjetaCredito> aplicableUso(@RequestParam String uso){
		log.info("Tarjetas aplicable uso: ["+uso.toUpperCase()+"]");
		return service.consultarUso(uso.toUpperCase());
	}
	
	@GetMapping("/tarjetascredito/salario")
    public List<TarjetaCredito> aplicableSalario(@RequestParam Integer salario){
		log.info("Tarjetas aplicable salario: ["+salario+"]");
        return service.consultarSalario(salario);
    }
	
	@GetMapping("/tarjetascredito/edad")
    public List<TarjetaCredito> aplicableEdad(@RequestParam Integer edad){
		log.info("Tarjetas aplicable edad: ["+edad+"]");
        return service.consultarEdad(edad);
    }
	
	

}
