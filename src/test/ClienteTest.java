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

/**
 * 
 */
class ClienteTest {

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
	    public void testConstructorCliente() {
	        Cliente cliente = new Cliente("John", "Doe", "123 Main St", 123456789);
	        assertEquals("John", cliente.getNombre());
	        assertEquals("Doe", cliente.getApellido());
	        assertEquals("123 Main St", cliente.getDireccion());
	        assertEquals(123456789, cliente.getDni());
	    }
	
	
	

}
