package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import banco.Cuenta;

class CuentaTest {
	
	static Cuenta CuentaCliente;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
			CuentaCliente = new Cuenta("12345", "Manuel", 0);
		
		double SaldoInicial =0;
		double Monto =0;
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testIngresar() {
		CuentaCliente.ingresar(1000);
		assertEquals(CuentaCliente.getSaldo(),1000);
	}
	
	@Test
	void testRetirar() {
		CuentaCliente.retirar(1000);
		assertEquals(CuentaCliente.getSaldo(),0);
	}

}
