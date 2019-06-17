package com.ipartek.juego;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TrenTest {
	
	Tren tren;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		tren = new Tren("Locomotora", "LOC-123", 3, 5);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTren() {
		fail("Not yet implemented");
	}

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
		fail("Not yet implemented");
	}

	@Test
	public void testGetReferencia() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetReferencia() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAsientosOcupados() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAsientosOcupados() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAnosActivo() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAnosActivo() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testTrenLleno() {
		fail("Not yet implemented");
	}

	@Test
	public void testDemasiadoViejo() {
		fail("Not yet implemented");
	}

}
