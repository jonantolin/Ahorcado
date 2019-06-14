package com.ipartek.juego;

import java.util.Scanner;

public class JuegoAhorcado {

	// Necesarias:
	// palabra escogida
	// letra introducida por teclado
	// for que recorrera la palabra escogida char por char comparando caracteres
	// si coinciden rellenara ese caracter en el array (o String?) de caracteres '_'
	// también rellenará otro array de caracteres ya acertados
	// array char (o String?) del tamaño de la palabra escogida, relleno con '_'
	// numero de oportunidades, serán 7
	// booleano acertada letra
	// booleano de si ha ganado

	private static final String PALABRA_ESCOGIDA = "VIERNES";
	private static final int INTENTOS_TOTALES = 7;
	
	public JuegoAhorcado() {
		
		Scanner sc = new Scanner(System.in);
		
		boolean ganado = false;
		int intentosGastados = 0;
		 String palabraGuiones = ""; //palabra oculta que ira rellenándose con las letras acertadas
		char [] palabraAcertadas = new char [PALABRA_ESCOGIDA.length()]; //array de letras acertadas
		
		// Relleno con guiones bajos lo que se mostrará al usuario al inicio
		// Se ira rellenando con los caracteres acertados
		for (int i = 0; i < PALABRA_ESCOGIDA.length(); i++) {
			palabraAcertadas[i] = '_';
			palabraGuiones += "_";
		}
		
		String aux = ""; // Por si el usuario mete más de un caracter y para el Scanner
		char letraIntroducida;
		
		System.out.println("Empieza el juego");
		System.out.println("----------------");
		System.out.println("\nTienes "+INTENTOS_TOTALES+" intentos");
		System.out.println("Intento ("+intentosGastados+"/"+INTENTOS_TOTALES+")");
		
		System.out.println("Palabra a adivinar: "+palabraGuiones);
		
		while(!ganado && intentosGastados <= INTENTOS_TOTALES) {
			
			System.out.println("\nPor favor, introduce una letra: ");
			
			aux = ""; // Reinicio la letra introducida con tamaño 0 por si acaso
			aux = sc.next();
			
			if(aux.length() == 1) {
				letraIntroducida = aux.charAt(0);
				
				// Paso la letra introducida a MAYUSCULAS
				letraIntroducida = Character.toUpperCase(letraIntroducida);
				
				boolean letraAcertada = false;
				
				for (int i = 0; i < PALABRA_ESCOGIDA.length(); i++) {
					
					if(letraIntroducida == PALABRA_ESCOGIDA.charAt(i)) {
						
						letraAcertada = true;
						palabraAcertadas[i] = letraIntroducida;
						
						palabraGuiones = "";
						for (int j = 0; j < palabraAcertadas.length; j++) {
							palabraGuiones += palabraAcertadas[j];
						}
					}
	
				} // termina for
				
				if(!letraAcertada) {
					intentosGastados++;
				}
				
				
				/* Para comprobar si ha ganado comprueblo si quedan
				 * guiones en palabraGuiones, que es la palabra
				 * oculta que se va rellenando con las letras
				 * acertadas
				 *  */
				int guionesEncontrados = 0;
				for (int i = 0; i < palabraGuiones.length(); i++) {
					if(palabraGuiones.charAt(i) == '_') {
						guionesEncontrados++;
					}
				}
				
				if(guionesEncontrados == 0) {
					
					ganado = true;
					System.out.println("\nFELICIDADES, HAS SOBREVIVIDO AL AHORCADO");
					
				}else {
					System.out.println("\nPalabra a adivinar: "+palabraGuiones);
					System.out.println("Intento ("+intentosGastados+"/"+INTENTOS_TOTALES+")");
				}
				
				
				
			}else { // Si ha introducido mas de una letra por teclado
				System.out.println("Debes introducir una sola letra, vuelve a introducir caracter");
			}
		}
		
		
	}
}
