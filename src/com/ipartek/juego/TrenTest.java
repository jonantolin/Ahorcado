package com.ipartek.juego;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TrenTest {
	
	Tren tren;
	static final String TIPO = "Locomotora";
	static final String REFERENCIA = "Locomotora";
	static final int ASIENTOS_OCUPADOS = 30;
	static final int ANOS_ACTIVOS = 20;
	
	@BeforeClass  // Podría servir por ejemplo para acceder a la base de datos al inicio de las pruebas
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		tren = new Tren(TIPO, REFERENCIA, ASIENTOS_OCUPADOS, ANOS_ACTIVOS);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTren() {
		assertEquals(TIPO, tren.getTipo());
		assertEquals(REFERENCIA, tren.getReferencia());
		assertEquals(ASIENTOS_OCUPADOS, tren.getAsientosOcupados());
		assertEquals(ANOS_ACTIVOS, tren.getAnosActivo());
		
		Tren tNull = new Tren(null, null, -5, 0);
		assertEquals(null, tNull.getTipo());
		assertEquals(null, tNull.getReferencia());
		assertEquals(-5, tNull.getAsientosOcupados());
		assertEquals(0, tNull.getAnosActivo());
	}
	
	@Ignore
	@Test
	public void testTrenStringStringIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTipo() {
		assertEquals("Realizada", "Locomotora", tren.getTipo());
	}

	@Test
	public void testSetTipo() {

		tren.setTipo("pasajeros");
		assertEquals("pasajeros",tren.getTipo());
		
		tren.setTipo(null);
		assertEquals(null, tren.getTipo());
	}

	@Test
	public void testGetReferencia() {
		assertEquals(REFERENCIA,tren.getReferencia());
	}

	@Test
	public void testSetReferencia() {
		tren.setReferencia("1234r");
		assertEquals("1234r",tren.getReferencia());
		
		tren.setReferencia(null);
		assertEquals(null, tren.getReferencia());
	}

	@Test
	public void testGetAsientosOcupados() {
		assertEquals(ASIENTOS_OCUPADOS, tren.getAsientosOcupados());
	}

	@Test
	public void testSetAsientosOcupados() {
		tren.setAsientosOcupados(1234);
		assertEquals(1234,tren.getAsientosOcupados());
		
		tren.setAsientosOcupados(-5);
		assertEquals(-5, tren.getAsientosOcupados());
	}
	
	@Ignore
	@Test
	public void testGetAnosActivo() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAnosActivo() {
		tren.setAnosActivo(120);
		assertEquals(120, tren.getAnosActivo());
		
		tren.setAnosActivo(-5);
		assertEquals(-5, tren.getAnosActivo());
	}
	
	@Ignore
	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testTrenLleno() {
		tren.setAsientosOcupados(401);
		assertEquals("El tren está completo", tren.trenLleno());
		
		tren.setAsientosOcupados(400);
		assertEquals("El tren aun no está lleno", tren.trenLleno());
	}

	@Test
	public void testDemasiadoViejo() {
		tren.setAnosActivo(40);;
		assertEquals("FUERA DE CIRCULACION", tren.demasiadoViejo());
		
		tren.setAnosActivo(39);
		assertEquals("EN CIRCULACIÓN", tren.demasiadoViejo());
	}

}
