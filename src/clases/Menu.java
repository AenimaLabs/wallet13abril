/**
 * 
 */
package clases;

import java.util.Scanner;

import interfaces.Moneda;
import servicios.GestionCliente;
import servicios.GestionCuenta;
import servicios.OperacionesBancarias;

/**
 * 
 */
public class Menu {

	private Cliente cliente;
	private Cuenta cuenta;
	private Scanner scanner;
	//private GestionCliente gestionCliente;
	//private GestionCuenta gestionCuenta;
	//private OperacionesBancarias operacionesBancarias;

	public Menu() {
		scanner = new Scanner(System.in);
		//gestionCliente = new GestionCliente();
		//gestionCuenta = new GestionCuenta(scanner, null, gestionCliente, null);
		//operacionesBancarias = new OperacionesBancarias();
	}

	public void mostrarMenu() {
		int opcion;
		do {
			System.out.println("\n---- Menú ----");
			System.out.println("1. Crear Cliente");
			System.out.println("2. Crear Cuenta");
			System.out.println("3. Mostrar Datos del Cliente");
			System.out.println("4. Mostrar Datos de la Cuenta");
			System.out.println("5. Depositar");
			System.out.println("6. Retirar");
			System.out.println("7. Convertir Moneda");
			System.out.println("8. Mostrar Saldo");
			System.out.println("9. Salir");
			System.out.print("Ingrese la opción deseada: ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				//gestionCliente.crearCliente();
				//cliente = gestionCliente.getCliente();
				//gestionCuenta.setCliente(cliente); // Actualiza el objeto cliente en GestionCuenta
				crearCliente();
				break;
			case 2:
				//gestionCuenta.crearCuenta();
				//cuenta = gestionCuenta.getCuenta();
				//operacionesBancarias.setCuenta(cuenta);// Establece la cuenta en OperacionesBancarias
				crearCuenta();

				break;
			case 3:
				//gestionCliente.mostrarDatosCliente();
				 mostrarDatosCliente();

				break;
			case 4:
				//gestionCuenta.mostrarDatosCuenta();
				mostrarDatosCuenta();

				break;
			case 5:
				//operacionesBancarias.depositar();
				depositar();
				break;
			case 6:
				//operacionesBancarias.retirar();
				retirar();
				break;
			case 7:
				//operacionesBancarias.convertirMoneda();
				convertirMoneda();
				break;
			case 8:
				//operacionesBancarias.mostrarSaldo();
				mostrarSaldo();
				break;
			case 9:
				System.out.println("¡Hasta luego!");
				break;
			default:
				System.out.println("Opción no válida. Inténtelo de nuevo.");
			}
		} while (opcion != 9);
	}

	////////////////////////////////////////////////////////////////////////////////////

	private void crearCliente() {
		System.out.print("Ingrese el nombre del cliente: ");
		String nombre = scanner.next();
		System.out.print("Ingrese el apellido del cliente: ");
		String apellido = scanner.next();
		System.out.print("Ingrese la dirección del cliente: ");
		String direccion = scanner.nextLine();// consumir el salto de linea pendiente direccion =
		scanner.nextLine(); // leer la direccion
		System.out.print("Ingrese el DNI del cliente: ");
		int dni = scanner.nextInt();

		cliente = new Cliente(nombre, apellido, direccion, dni);
		System.out.println("Cliente creado correctamente.");
	}

	private void crearCuenta() {
		if (cliente == null) {
			System.out.println("Primero debe crear un cliente.");
			return;
		}

		System.out.print("Ingrese el alias de la cuenta: ");
		String alias = scanner.next();
		System.out.print("Ingrese el número de cuenta: ");
		String numeroCuenta = scanner.next();
		System.out.print("Ingrese el balance inicial de la cuenta: ");
		double balanceInicial = scanner.nextDouble();

		cuenta = new Cuenta(balanceInicial, alias, numeroCuenta, cliente);
		System.out.println("Cuenta creada correctamente.");
	}

	private void mostrarDatosCliente() {
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

	private void mostrarDatosCuenta() {
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

	private void depositar() {
		if (cuenta == null) {
			System.out.println("No hay ninguna cuenta creada.");
			return;
		}

		System.out.print("Ingrese la cantidad a depositar: ");
		double cantidad = scanner.nextDouble();
		
		cuenta.depositar(cantidad);

	}

	private void retirar() {
		if (cuenta == null) {
			System.out.println("No hay ninguna cuenta creada.");
			return;
		}

		System.out.print("Ingrese la cantidad a retirar: ");
		double cantidad = scanner.nextDouble();
		cuenta.retirar(cantidad);
	}

	private void convertirMoneda() {

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
		;
		System.out.println("Cantidad convertida a " + moneda.getSimbolo() + ": " + cantidadConvertida);

	}

	private void mostrarSaldo() {
		if (cuenta == null) {
			System.out.println("No hay ninguna cuenta creada.");
		} else {
			System.out.println("Saldo actual: " + cuenta.saldo());
		}
	}

}
