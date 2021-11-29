package com.ibm.academia.banrul.repositories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ibm.academia.banrul.entities.TarjetaCredito;

import org.springframework.boot.CommandLineRunner;

@Configuration
public class CargaBaseDatos {
	private static final Logger log = LoggerFactory.getLogger(CargaBaseDatos.class);

    @Bean
    CommandLineRunner initDatabase(TarjetaCreditoRepository tarjetaCreditoRepository) {

        return args -> {
        		
             log.info("Carga Shopping 1.1.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("B*Smart" , "SHOPPING" , 7000 , 14999 , 18 , 23)));
             log.info("Carga Shopping 1.1.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Afinity Card" , "SHOPPING" , 7000 , 14999 , 18 , 23)));
             
             log.info("Carga Shopping 1.1.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("B*Smart" , "SHOPPING" , 7000 , 14999 , 24 , 32)));
             log.info("Carga Shopping 1.1.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Clasica" , "SHOPPING" , 7000 , 14999 , 24 , 32)));
             log.info("Carga Shopping 1.1.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Afinity Card" , "SHOPPING" , 7000 , 14999 , 24 , 32)));
             log.info("Carga Shopping 1.1.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Office Depot" , "SHOPPING" , 7000 , 14999 , 24 , 32)));
             log.info("Carga Shopping 1.1.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Costco" , "SHOPPING" , 7000 , 14999 , 24 , 32)));
             log.info("Carga Shopping 1.1.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Best Buy Banamex" , "SHOPPING" , 7000 , 14999 , 24 , 32)));
             log.info("Carga Shopping 1.1.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("The Home Depot" , "SHOPPING" , 7000 , 14999 , 24 , 32)));
             
             log.info("Carga Shopping 1.1.3: " + tarjetaCreditoRepository.save(new TarjetaCredito("Clasica" , "SHOPPING" , 7000 , 14999 , 33 , 75)));
             log.info("Carga Shopping 1.1.3: " + tarjetaCreditoRepository.save(new TarjetaCredito("Office Depot" , "SHOPPING" , 7000 , 14999 , 33 , 75)));
             log.info("Carga Shopping 1.1.3: " + tarjetaCreditoRepository.save(new TarjetaCredito("Costco" , "SHOPPING" , 7000 , 14999 , 33 , 75)));
             log.info("Carga Shopping 1.1.3: " + tarjetaCreditoRepository.save(new TarjetaCredito("Best Buy Banamex" , "SHOPPING" , 7000 , 14999 , 33 , 75)));
             log.info("Carga Shopping 1.1.3: " + tarjetaCreditoRepository.save(new TarjetaCredito("The Home Depot" , "SHOPPING" , 7000 , 14999 , 33 , 75)));
             
             log.info("Carga Shopping 1.2.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("B*Smart" , "SHOPPING" , 15000 , 34999 , 18 , 23)));
             log.info("Carga Shopping 1.2.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Afinity Card" , "SHOPPING" , 15000 , 34999 , 18 , 23)));
             
             log.info("Carga Shopping 1.2.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Oro" , "SHOPPING" , 15000 , 34999 , 24 , 32)));
             log.info("Carga Shopping 1.2.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Afinity Card" , "SHOPPING" , 15000 , 34999 , 24 , 32)));
             log.info("Carga Shopping 1.2.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Office Depot" , "SHOPPING" , 15000 , 34999 , 24 , 32)));
             log.info("Carga Shopping 1.2.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Costco" , "SHOPPING" , 15000 , 34999 , 24 , 32)));
             log.info("Carga Shopping 1.2.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Best Buy Banamex" , "SHOPPING" , 15000 , 34999 , 24 , 32)));
             log.info("Carga Shopping 1.2.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("The Home Depot" , "SHOPPING" , 15000 , 34999 , 24 , 32)));
             
             log.info("Carga Shopping 1.2.3: " + tarjetaCreditoRepository.save(new TarjetaCredito("Oro" , "SHOPPING" , 15000 , 34999 , 33 , 75)));
             log.info("Carga Shopping 1.2.3: " + tarjetaCreditoRepository.save(new TarjetaCredito("Office Depot" , "SHOPPING" , 15000 , 34999 , 33 , 75)));
             log.info("Carga Shopping 1.2.3: " + tarjetaCreditoRepository.save(new TarjetaCredito("Costco" , "SHOPPING" , 15000 , 34999 , 33 , 75)));
             log.info("Carga Shopping 1.2.3: " + tarjetaCreditoRepository.save(new TarjetaCredito("Best Buy Banamex" , "SHOPPING" , 15000 , 34999 , 33 , 75)));
             log.info("Carga Shopping 1.2.3: " + tarjetaCreditoRepository.save(new TarjetaCredito("The Home Depot" , "SHOPPING" , 15000 , 34999 , 33 , 75)));
             
             log.info("Carga Shopping 1.3.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("B*Smart" , "SHOPPING" , 35000 , 49999 , 18 , 23)));
             log.info("Carga Shopping 1.3.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Afinity Card" , "SHOPPING" , 35000 , 49999 , 18 , 23)));
             
             log.info("Carga Shopping 1.3.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Platinum" , "SHOPPING" , 35000 , 49999 , 24 , 75)));
             log.info("Carga Shopping 1.3.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Office Depot" , "SHOPPING" , 35000 , 49999 , 24 , 75)));
             log.info("Carga Shopping 1.3.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Costco" , "SHOPPING" , 35000 , 49999 , 24 , 75)));
             log.info("Carga Shopping 1.3.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Best Buy Banamex" , "SHOPPING" , 35000 , 49999 , 24 , 75)));
             log.info("Carga Shopping 1.3.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("The Home Depot" , "SHOPPING" , 35000 , 49999 , 24 , 75)));
             
             log.info("Carga Shopping 1.4.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("B*Smart" , "SHOPPING" , 50000 , Integer.MAX_VALUE , 18 , 23)));
             log.info("Carga Shopping 1.4.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Afinity Card" , "SHOPPING" , 50000 , Integer.MAX_VALUE , 18 , 23)));
             
             log.info("Carga Shopping 1.4.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Platinum" , "SHOPPING" , 50000 , Integer.MAX_VALUE , 24 , 75)));
             
             log.info("Carga Travels 2.1.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Citi / AAdvantage" , "TRAVELS" , 12000 , 29999 , 18 , 75)));
             
             log.info("Carga Travels 2.2.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Citi / AAdvantage" , "TRAVELS" , 30000 , 34999 , 18 , 23)));
             
             log.info("Carga Travels 2.2.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Citi / AAdvantage" , "TRAVELS" , 30000 , 34999 , 24 , 75)));
             log.info("Carga Travels 2.2.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Platinum" , "TRAVELS" , 30000 , 34999 , 24 , 75)));
             
             log.info("Carga Travels 2.3.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Citi / AAdvantage" , "TRAVELS" , 35000 , 49999 , 18 , 23)));
             
             log.info("Carga Travels 2.3.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Citi / AAdvantage" , "TRAVELS" , 35000 , 49999 , 24 , 75)));
             log.info("Carga Travels 2.3.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Platinum" , "TRAVELS" , 35000 , 49999 , 24 , 75)));
             
             log.info("Carga Travels 2.4.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Citi / AAdvantage" , "TRAVELS" , 50000 , Integer.MAX_VALUE , 18 , 22)));
             
             log.info("Carga Travels 2.4.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Platinum" , "TRAVELS" , 50000 , Integer.MAX_VALUE , 23 , 75)));
             
             log.info("Carga Help 3.1.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Banamex Teleton" , "HELP" , 12000 , Integer.MAX_VALUE , 18 , 75)));
             log.info("Carga Help 3.1.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("APAC" , "HELP" , 12000 , Integer.MAX_VALUE , 18 , 75)));
             
             log.info("Carga My business 4.1.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Office Depot" , "MY BUSINESS" , 7000 , Integer.MAX_VALUE , 18 , 75)));
             log.info("Carga My business 4.1.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Costco" , "MY BUSINESS" , 7000 , Integer.MAX_VALUE , 18 , 75)));
             log.info("Carga My business 4.1.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Best Buy Banamex" , "MY BUSINESS" , 7000 , Integer.MAX_VALUE , 18 , 75)));
             log.info("Carga My business 4.1.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("The Home Depot" , "MY BUSINESS" , 7000 , Integer.MAX_VALUE , 18 , 75)));
             
             log.info("Carga Sports 5.1.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Martí Clasica Citibanamex" , "SPORTS" , 7000 , 34999 , 18 , 75)));
             log.info("Carga Sports 5.1.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("America Deporteismo" , "SPORTS" , 7000 , 34999 , 18 , 75)));
             log.info("Carga Sports 5.1.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Pumas Deporteismo" , "SPORTS" , 7000 , 34999 , 18 , 75)));
             log.info("Carga Sports 5.1.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Toluca Deporteismo" , "SPORTS" , 7000 , 34999 , 18 , 75)));
             log.info("Carga Sports 5.1.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("La Verde Deporteismo" , "SPORTS" , 7000 , 34999 , 18 , 75)));
                          
             log.info("Carga Sports 5.2.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Martí Clasica Citibanamex" , "SPORTS" , 35000 , Integer.MAX_VALUE , 18 , 75)));
             
             log.info("Carga My style 6.1.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("B*Smart" , "MY STYLE" , 7000 , 14999 , 18 , 32)));
             log.info("Carga My style 6.1.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Afinity Card" , "MY STYLE" , 7000 , 14999 , 18 , 32)));
             
             log.info("Carga My style 6.1.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("B*Smart" , "MY STYLE" , 7000 , 14999 , 33 , 75)));
             
             log.info("Carga My style 6.2.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("B*Smart" , "MY STYLE" , 15000 , 29999 , 18 , 23)));
             log.info("Carga My style 6.2.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Afinity Card" , "MY STYLE" , 15000 , 29999 , 18 , 23)));
             
             log.info("Carga My style 6.2.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("B*Smart" , "MY STYLE" , 15000 , 29999 , 24 , 32)));
             log.info("Carga My style 6.2.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Oro" , "MY STYLE" , 15000 , 29999 , 24 , 32)));
             log.info("Carga My style 6.2.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Afinity Card" , "MY STYLE" , 15000 , 29999 , 24 , 32)));
             
             log.info("Carga My style 6.2.3: " + tarjetaCreditoRepository.save(new TarjetaCredito("Oro" , "MY STYLE" , 15000 , 29999 , 33 , 75)));
             
             log.info("Carga My style 6.3.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("B*Smart" , "MY STYLE" , 30000 , 34999 , 18 , 23)));
             log.info("Carga My style 6.3.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("Afinity Card" , "MY STYLE" , 30000 , 34999 , 18 , 23)));
             
             log.info("Carga My style 6.3.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("B*Smart" , "MY STYLE" , 30000 , 34999 , 24 , 32)));
             log.info("Carga My style 6.3.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Platinum" , "MY STYLE" , 30000 , 34999 , 24 , 32)));
             log.info("Carga My style 6.3.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Afinity Card" , "MY STYLE" , 30000 , 34999 , 24 , 32)));
             
             log.info("Carga My style 6.3.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Platinum" , "MY STYLE" , 30000 , 34999 , 33 , 75)));
             
             log.info("Carga My style 6.4.1: " + tarjetaCreditoRepository.save(new TarjetaCredito("B*Smart" , "MY STYLE" , 35000 , Integer.MAX_VALUE , 18 , 23)));
             
             log.info("Carga My style 6.4.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("B*Smart" , "MY STYLE" , 35000 , Integer.MAX_VALUE , 24 , 75)));
             log.info("Carga My style 6.4.2: " + tarjetaCreditoRepository.save(new TarjetaCredito("Platinum" , "MY STYLE" , 35000 , Integer.MAX_VALUE , 24 , 75)));
             
           
         };

    }
}
