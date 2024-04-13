/**
 * 
 */
package clases;

import interfaces.Moneda;

/**
 * 
 */
public class Dolar implements Moneda {

	@Override
	public String getSimbolo() {
		
		return "USD$";
	}

	@Override
	public double factorConversion() {
		
		return 0.001016;
	}

	@Override
	public double convertir(double cantidad) {
		double cantidadConvertida = cantidad*factorConversion();
		return cantidadConvertida;
		
	}

}
