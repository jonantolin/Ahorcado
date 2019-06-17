package com.ipartek.juego;

import java.util.Scanner;

public class Tren {
	
	
	private Scanner sc = new Scanner(System.in);
	private String tipo, referencia;
	
	private static final int ASIENTOS_TOTALES = 400;
	private static final int ANOS_MAXIMOS = 40;
	private int asientosOcupados;
	private int anosActivo;
	
	public Tren() {
		
		System.out.println("Introduzca tipo de tren: ");
		tipo = sc.next();
		
		System.out.println("Introducza referencia: ");
		referencia = sc.next();
		
		System.out.println("Introduzca billetes vendidos: ");
		asientosOcupados = sc.nextInt();
		
		System.out.println("Introduzca los años que lleva el tren en circulación: ");
		anosActivo = sc.nextInt();
		
	}
	
	public void trenLleno(int asientosOcupados) {
		if(asientosOcupados <= ASIENTOS_TOTALES) {
			System.out.println("El tren aun no está lleno");
		}else {
			System.out.println("El tren está completo");
		}
	}
	
	public void demasiadoViejo (int antiguedad) {
		if(antiguedad < 40) {
			System.out.println("EN CIRCULACIÓN");
		}else {
			System.out.println("FUERA DE CIRCULACION");
		}
	}
	
	
	public void mostrarDatos() {
		System.out.println("Datos del tren ");
		System.out.println("----------------");
		System.out.println("\nTipo: "+tipo);
		System.out.println("\nReferencia: "+referencia);
		System.out.println("\nAsientos ocupados: "+asientosOcupados+" de "+ASIENTOS_TOTALES);
		trenLleno(asientosOcupados);
		System.out.println("\nAños de servicio: "+anosActivo+"(si tiene más de "+ANOS_MAXIMOS+" años mandar a desmantelar tren)");
		demasiadoViejo(anosActivo);
	}
	
	
	public static void main(String[] args) {
		
		Tren tren1 = new Tren();
		tren1.mostrarDatos();

	}

}
