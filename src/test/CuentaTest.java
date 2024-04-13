/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.Cliente;
import clases.Cuenta;

/**
 * 
 */
class CuentaTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
    public void testConstructorCuenta() {
        Cliente cliente = new Cliente("John", "Doe", "123 Main St", 123456789);        
        Cuenta cuenta = new Cuenta(1000, "Cuenta corriente", "123456", cliente);
        assertEquals(1000, cuenta.saldo(),0);
        assertEquals("Cuenta corriente", cuenta.getAlias());
        assertEquals("123456", cuenta.getNumeroCuenta());
    }
	
	  @Test
	    public void testDepositar() {
	        Cliente cliente = new Cliente("John", "Doe", "123 Main St", 123456789);
	        Cuenta cuenta = new Cuenta(1000, "Cuenta corriente", "123456", cliente);
	        cuenta.depositar(500);
	        assertEquals(1500, cuenta.saldo(), 0);
	        
	    }

	    @Test
	    public void testRetirar() {
	        Cliente cliente = new Cliente("John", "Doe", "123 Main St", 123456789);	        
	        Cuenta cuenta = new Cuenta(1000, "Cuenta corriente", "123456", cliente);
	        cuenta.retirar(500);
	        assertEquals(500, cuenta.saldo(), 0);
	    }

}
