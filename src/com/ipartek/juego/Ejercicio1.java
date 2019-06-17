package com.ipartek.juego;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Jon
 *
 * Se introduciran el peso de 30 boxeadores (el enunciado obliga int)
 * Se indicará a qué categoria pertenece por peso
 * Si se mete un peso mal (no es int o esta fuera de rango) se capturará la excepción
 * y obligatoriamente se terminará la ejecución
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		int numBoxeadores = 30;
		int peso = 0;
		
		for (int i = 0; i < numBoxeadores; i++) {
			
			try {
				System.out.println("Introduzca peso del boxeador "+(i+1)+": ");
				peso = sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("Ha introducido datos sin el formato indicado o fuera de rango.");
				break;
			}
			if(peso < 0 || peso > 250) {
				System.out.println("No puedes poner un peso negativo o pesas demasiado (>250 kg)");
			}
			else if(peso > 95) {
				System.out.println("Peso Pesado");
			}else if(peso <= 90 && peso >= 65) {
				System.out.println("Peso mediano");
			}else if(peso <= 64 && peso >= 58) {
				System.out.println("Peso Ligero");
			}else if(peso <= 57 && peso >= 52) {
				System.out.println("Peso Pluma");
			}else { // peso < 52
				System.out.println("Peso Mosca");
			}
		}
		sc.close();
	}

}
