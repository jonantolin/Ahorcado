package com.ipartek.juego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrenTest {
	
	Tren tren;
	static final String TIPO = "Locomotora";
	static final String REFERENCIA = "Locomotora";
	static final int ASIENTOS_OCUPADOS = 30;
	static final int ANOS_ACTIVOS = 20;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		tren = new Tren("Locomotora", "LOC-123", 3, 5);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTren() {
		fail("Not yet implemented");
	}

	@Test
	void testTrenStringStringIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTipo() {
		
		assertEquals("Locomotora", tren.getTipo());
	}

	@Test
	void testSetTipo() {
		fail("Not yet implemented");
	}

	@Test
	void testGetReferencia() {
		fail("Not yet implemented");
	}

	@Test
	void testSetReferencia() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAsientosOcupados() {
		fail("Not yet implemented");
	}

	@Test
	void testSetAsientosOcupados() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAnosActivo() {
		fail("Not yet implemented");
	}

	@Test
	void testSetAnosActivo() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testTrenLleno() {
		fail("Not yet implemented");
	}

	@Test
	void testDemasiadoViejo() {
		fail("Not yet implemented");
	}

}
