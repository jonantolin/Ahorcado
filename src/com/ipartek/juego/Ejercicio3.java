package com.ipartek.juego;

import java.util.Scanner;

/**
 * 
 * @author Jon
 * 
 * Introducir 10 numeros por teclado y guardar en array
 * Obtener los múltiplos de 7
 * Hallar media aritmética
 * 
 * int[] datos -> El array de numeros a introducir y evaluar
 * int suma -> La suma de todos los números
 * float media -> La media aritmetica
 */
public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] datos = new int [10];
		float suma = 0;
		float media;
		
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
		
		media = suma / datos.length; // No hace falta redondear con Math.round porque se dividira entre 10(solo 1 decimal)
		System.out.println("Numeros introducidos: \n");
		
		for (int i = 0; i < datos.length; i++) {
			System.out.print(datos[i] + " ");
		}
		
		
		System.out.println("\nMedia aritmética: ");
		System.out.printf("%.2f", media); //Lo formateo para mostrar siempre dos decimales (aunque acabe en 0)
		
		sc.close();
	
	}

}
