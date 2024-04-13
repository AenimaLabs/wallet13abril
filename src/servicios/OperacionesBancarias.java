/**
 * 
 */
package servicios;

import java.util.Scanner;

import clases.Cuenta;
import clases.Dolar;
import clases.Euro;
import interfaces.Moneda;

/**
 * 
 */
public class OperacionesBancarias {

	private Cuenta cuenta;
	private Scanner scanner;
	

	/**
	 * 
	 */
	public OperacionesBancarias() {
		scanner = new Scanner(System.in);
	}

	/**
	 * @param cuenta
	 * @param scanner
	 */
	public OperacionesBancarias(Cuenta cuenta, Scanner scanner) {
		this.cuenta = cuenta;
		this.scanner = scanner;
	}

	public void depositar() {
		if (cuenta == null) {
			System.out.println("No hay ninguna cuenta creada.");
			return;
		}

		System.out.print("Ingrese la cantidad a depositar: ");
		double cantidad = scanner.nextDouble();
		cuenta.depositar(cantidad);

	}

	public void retirar() {
		if (cuenta == null) {
			System.out.println("No hay ninguna cuenta creada.");
			return;
		}

		System.out.print("Ingrese la cantidad a retirar: ");
		double cantidad = scanner.nextDouble();
		cuenta.retirar(cantidad);
	}

	public void convertirMoneda() {

		System.out.println("Ingrese la cantidad a convertir:");
		double cantidad = scanner.nextDouble();
		System.out.println("Seleccione la moneda a la que desea convertir:");
		System.out.println("1.- Euro");
		System.out.println("2.- Dolar");
		int opcion = scanner.nextInt();

		Moneda moneda;
		if (opcion == 1) {
			moneda = new Euro();
		} else if (opcion == 2) {
			moneda = new Dolar();
		} else {
			System.out.println("Opción no válida.");

			return;
		}

		double cantidadConvertida = moneda.convertir(cantidad);
		
		System.out.println("Cantidad convertida a " + moneda.getSimbolo() + ": " + cantidadConvertida);

	}

	public void mostrarSaldo() {
		if (cuenta == null) {
			System.out.println("No hay ninguna cuenta creada.");
		} else {
			System.out.println("Saldo actual: " + cuenta.saldo());
		}
	}

	/**
	 * @return the cuenta
	 */
	public Cuenta getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return the scanner
	 */
	public Scanner getScanner() {
		return scanner;
	}

	/**
	 * @param scanner the scanner to set
	 */
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

}
