package com.ipartek.juego;

import java.util.Scanner;

/**
 * 
 * @author Jon
 * 
 * Introducir puntos de campeonato para saber si aun puede ganar o lo lleva jodido
 * 
 * A traves de una funcion que devuelva valor booleano.
 * 
 * int x -> los puntos a evaluar
 *
 */

public class Ejercicio2 {

	
	private static int x = 0;

	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		Ejercicio2.x = x;
	}

	public static boolean ganar() {

		boolean puedeGanar = false;
		if(x >= 70) {
			puedeGanar = true;
		}
		
		return puedeGanar;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tus puntos del camponato: ");
		Ejercicio2.setX(sc.nextInt());
		if(Ejercicio2.ganar()) {
			System.out.println("Puede ganar el campeonato");
		}else {
			System.out.println("Ponte las pilas si quieres ganar");
		}
		
		sc.close();
	}

}
