package servicios;

import java.util.Scanner;

import clases.Cliente;

public class GestionCliente {
	
	private Scanner scanner;
	private Cliente cliente;
	
	

	
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

	/**
	 * 
	 */
	public GestionCliente() {
		scanner = new Scanner(System.in);
		
	}
	
	/**
	 * @param scanner
	 * @param cliente
	 */
	public GestionCliente(Scanner scanner, Cliente cliente) {
		this.scanner = scanner;
		this.cliente = cliente;
	}


	public void crearCliente() {
		System.out.print("Ingrese el nombre del cliente: ");
		String nombre = scanner.next();
		System.out.print("Ingrese el apellido del cliente: ");
		String apellido = scanner.next();
		System.out.print("Ingrese la dirección del cliente: ");
		String direccion = scanner.nextLine();// consumir el salto de linea pendiente
		direccion = scanner.nextLine(); // leer la direccion
		System.out.print("Ingrese el DNI del cliente: ");
		int dni = scanner.nextInt();
		scanner.nextLine();

		cliente = new Cliente(nombre, apellido, direccion, dni);
		System.out.println("Cliente creado correctamente.");
	}
	
	 public void mostrarDatosCliente() {
		if (cliente == null) {
			System.out.println("No hay ningún cliente creado.");
		} else {
			System.out.println("Datos del Cliente:");
			System.out.println("Nombre: " + cliente.getNombre());
			System.out.println("Apellido: " + cliente.getApellido());
			System.out.println("Dirección: " + cliente.getDireccion());
			System.out.println("DNI: " + cliente.getDni());
		}
	}
}
