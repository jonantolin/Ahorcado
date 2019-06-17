package com.ipartek.juego;

import java.util.Scanner;

public class Ejercicio3 {
	
	Scanner sc = new Scanner(System.in);
	private int [] datos = new int [10];
	private int suma = 0;
	private float media;
	
	public Ejercicio3() {
		
		for (int i = 0; i < datos.length; i++) {
			System.out.println("Dato "+(i+1)+", Introduce un numero: ");
			datos[i] = sc.nextInt();
		}
		
		for (int i = 0; i < datos.length; i++) {
			if(datos[i] % 7 == 0) {
				System.out.println(datos[i]+" Es un múltiplo de 7");
			}
			suma += datos[i];
		}
		
		media = suma / datos.length;
		System.out.println("Numeros introducidos: \n");
		
		for (int i = 0; i < datos.length; i++) {
			System.out.print(datos[i] + " ");
		}
		
		
		System.out.println("\nMedia aritmética: ");
		System.out.println(media);
		
	}
	
	public static void main(String[] args) {
		
		new Ejercicio3();
		

	}

}
