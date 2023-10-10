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
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		CuentaCliente.setSaldo(0);
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
	void testIngresarNumeroMenor0() {
		CuentaCliente.ingresar(-1000);
		assertEquals(CuentaCliente.getSaldo(),0);
	}
	
	
	@Test
	void testRetirar() {
		CuentaCliente.setSaldo(1000);
		CuentaCliente.retirar(1000);
		assertEquals(CuentaCliente.getSaldo(),0);
	}
	
	@Test
	void testRetirarMasSaldodelquehay() {
		CuentaCliente.retirar(-1000);
		assertEquals(CuentaCliente.getSaldo(),0);
	}
	
	@Test
	void testRetirarNumeroMayor0() {
		CuentaCliente.retirar(1000);
		assertEquals(CuentaCliente.getSaldo(),0);
	}

}
