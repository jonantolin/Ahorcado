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

	static Scanner sc = new Scanner(System.in);
	
	static int x = 0;

	public static boolean ganar() {
		
		System.out.println("Introduce tus puntos del camponato: ");
		x = sc.nextInt();
		
		boolean puedeGanar = false;
		if(x >= 70) {
			puedeGanar = true;
		}
		
		return puedeGanar;
	}
	
	public static void main(String[] args) {
		
		if(Ejercicio2.ganar()) {
			System.out.println("Puede ganar el campeonato");
		}else {
			System.out.println("Ponte las pilas si quieres ganar");
		}

	}

}
