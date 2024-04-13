/**
 * 
 */
package clases;

/**
 * 
 */
public class Cuenta {

	private double balance;
	private String alias;
	private String numeroCuenta;
	private Cliente cliente;

	/**
	 * 
	 */
	public Cuenta() {
	}

	/**
	 * @param balance
	 * @param alias
	 * @param numeroCuenta
	 * @param cliente
	 */
	public Cuenta(double balance, String alias, String numeroCuenta, Cliente cliente) {
		this.balance = balance;
		this.alias = alias;
		this.numeroCuenta = numeroCuenta;
		this.cliente = cliente;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * @return the numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
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

	@Override
	public String toString() {
		return "Cuenta [balance=" + balance + ", alias=" + alias + ", numeroCuenta=" + numeroCuenta + ", cliente="
				+ cliente + "]";
	}

	//////////////////////////////////////////////////////////

	public void retirar(double cantidad) {
		if (cantidad > 0 && cantidad <= balance) {
			balance -= cantidad; // balance = balance - cantidad
			System.out.println("Retirada de " + cantidad + " realizada con éxito.");
		} else {
			System.out.println("No se puede retirar esa cantidad.");
		}
	}

	public void depositar(double cantidad) {
		if (cantidad > 0) {
			balance += cantidad; // balance = balance + cantidad
			System.out.println("Depósito de " + cantidad + " realizado con éxito.");
		} else {
			System.out.println("No se puede depositar esa cantidad.");
		}
	}

	public double saldo() {
		return balance;
	}

}
