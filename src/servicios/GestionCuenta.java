package servicios;

import java.util.Scanner;

import clases.Cliente;
import clases.Cuenta;

public class GestionCuenta {

	private Scanner scanner;
	private Cuenta cuenta;
	private GestionCliente gestionCliente;
	private Cliente cliente;

	/**
	 * 
	 */
	public GestionCuenta() {
		scanner = new Scanner(System.in);

	}

	/**
	 * @param scanner
	 * @param cuenta
	 * @param gestionCliente
	 * @param cliente
	 */
	public GestionCuenta(Scanner scanner, Cuenta cuenta, GestionCliente gestionCliente, Cliente cliente) {
		this.scanner = scanner;
		this.cuenta = cuenta;
		this.gestionCliente = gestionCliente;
		this.cliente = cliente;
	}

	public void crearCuenta() {
		if (cliente == null) {
			System.out.println("Primero debe crear un cliente.");
			return;
		}
		cliente = gestionCliente.getCliente();
		System.out.print("Ingrese el alias de la cuenta: ");
		String alias = scanner.next();
		System.out.print("Ingrese el número de cuenta: ");
		String numeroCuenta = scanner.next();
		System.out.print("Ingrese el balance inicial de la cuenta: ");
		double balanceInicial = scanner.nextDouble();

		cuenta = new Cuenta(balanceInicial, alias, numeroCuenta, cliente);
		System.out.println("Cuenta creada correctamente.");
	}

	public void mostrarDatosCuenta() {
		if (cuenta == null) {
			System.out.println("No hay ninguna cuenta creada.");
		} else {
			System.out.println("Datos de la Cuenta:");
			System.out.println("Cliente: " + cliente);
			System.out.println("Alias: " + cuenta.getAlias());
			System.out.println("Número de Cuenta: " + cuenta.getNumeroCuenta());
			System.out.println("Saldo: " + cuenta.saldo());
		}
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
	 * @return the gestionCliente
	 */
	public GestionCliente getGestionCliente() {
		return gestionCliente;
	}

	/**
	 * @param gestionCliente the gestionCliente to set
	 */
	public void setGestionCliente(GestionCliente gestionCliente) {
		this.gestionCliente = gestionCliente;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
