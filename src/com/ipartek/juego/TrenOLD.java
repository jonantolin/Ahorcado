package com.ipartek.juego;

import java.util.Scanner;

/**
 * 
 * @author Jon
 * 
 * Se introduciran los datos de un tren (Tipo, Referencia, Asientos ocupados y A�os en circulaci�n)
 * Se mostrar�n los datos introducidos, indicando si esta lleno o no (asientosOcupados < 400) y
 * si por antiguedad est� en circulaci�n o no (o deber�a estarlo) (anosActivo < 40)
 *
 */

public class TrenOLD {
	
	
	private Scanner sc = new Scanner(System.in);
	private String tipo, referencia;
	
	private static final int ASIENTOS_TOTALES = 400;
	private static final int ANOS_MAXIMOS = 40;
	private int asientosOcupados;
	private int anosActivo;
	
	public TrenOLD() {
		
		System.out.println("Introduzca tipo de tren: ");
		tipo = sc.next();
		
		System.out.println("Introducza referencia: ");
		referencia = sc.next();
		
		System.out.println("Introduzca billetes vendidos: ");
		asientosOcupados = sc.nextInt();
		
		System.out.println("Introduzca los a�os que lleva el tren en circulaci�n: ");
		anosActivo = sc.nextInt();
		
	}
	
	public void trenLleno(int asientosOcupados) {
		if(asientosOcupados <= ASIENTOS_TOTALES) {
			System.out.println("El tren aun no est� lleno");
		}else {
			System.out.println("El tren est� completo");
		}
	}
	
	public void demasiadoViejo (int antiguedad) {
		if(antiguedad < 40) {
			System.out.println("EN CIRCULACI�N");
		}else {
			System.out.println("FUERA DE CIRCULACION");
		}
	}
	
	
	public void mostrarDatos() { // Otra opci�n podia ser sobreescribir el toString()
		System.out.println("Datos del tren ");
		System.out.println("----------------");
		System.out.println("\nTipo: "+tipo);
		System.out.println("\nReferencia: "+referencia);
		System.out.println("\nAsientos ocupados: "+asientosOcupados+" de "+ASIENTOS_TOTALES);
		trenLleno(asientosOcupados);
		System.out.println("\nA�os de servicio: "+anosActivo+"(si tiene m�s de "+ANOS_MAXIMOS+" a�os mandar a desmantelar tren)");
		demasiadoViejo(anosActivo);
	}
	
	


}
