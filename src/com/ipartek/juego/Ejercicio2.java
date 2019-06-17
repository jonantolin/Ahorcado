package com.ipartek.juego;

import java.util.Scanner;

public class Ejercicio2 {

	static Scanner sc = new Scanner(System.in);
	
	static boolean puedeGanar = false;
	static int x = 0;

	public static boolean ganar() {
		
		System.out.println("Introduce tus puntos del camponato: ");
		x = sc.nextInt();
		
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
