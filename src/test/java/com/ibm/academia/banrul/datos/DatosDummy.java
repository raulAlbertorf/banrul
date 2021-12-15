package com.ibm.academia.banrul.datos;

import com.ibm.academia.banrul.entities.TarjetaCredito;

public class DatosDummy {

	public static TarjetaCredito tarjetaCredito01() {
		return new TarjetaCredito("Citi / AAdvantage" , "TRAVELS" , 12000 , 29999 , 18 , 75);
	}
	
	public static TarjetaCredito tarjetaCreditoShopping01() {
		return new TarjetaCredito("Oro" , "SHOPPING" , 15000 , 34999 , 24 , 32);
	}
	public static TarjetaCredito tarjetaCreditoShopping02() {
		return new TarjetaCredito("Office Depot" , "SHOPPING" , 15000 , 34999 , 24 , 32);
	}
	public static TarjetaCredito tarjetaCreditoShopping03() {
		return new TarjetaCredito("Afinity Card" , "SHOPPING" , 15000 , 34999 , 24 , 32);
	}
	public static TarjetaCredito tarjetaCreditoShopping04() {
		return new TarjetaCredito("Costco" , "SHOPPING" , 15000 , 34999 , 24 , 32);
	}
	public static TarjetaCredito tarjetaCreditoShopping05() {
		return new TarjetaCredito("Best Buy Banamex" , "SHOPPING" , 15000 , 34999 , 24 , 32);
	}
	public static TarjetaCredito tarjetaCreditoShopping06() {
		return new TarjetaCredito("The Home Depot" , "SHOPPING" , 15000 , 34999 , 24 , 32);
	}
	
}
