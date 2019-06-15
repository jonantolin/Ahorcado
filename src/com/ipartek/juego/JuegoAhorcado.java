package com.ipartek.juego;

import java.util.Scanner;

/**
 * 
 * @author Jon
 *
 * 
 */
public class JuegoAhorcado {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static String [] palabrasPosibles = {"VIERNES", "ORDENADOR", "PROGRAMACION", "LENGUAJE", "INTERPRETE", "MAQUINA"};
	private static String PALABRA_ESCOGIDA = palabrasPosibles[(int) (Math.random()*palabrasPosibles.length)];
	private static final int INTENTOS_TOTALES = 7;
	private static int intentoActual;
	

	public JuegoAhorcado() { 
		
		partidaNueva();
	}

	
	public void partidaNueva() {
		
		
		System.out.println("Pulsa ENTER para jugar solo o Escribe una palabra que otro jugador tendrá que adivinar");
		String escogida = sc.nextLine().toUpperCase();
		
		
		if(escogida.length() > 0) {
			setPALABRA_ESCOGIDA(escogida);
		}
		jugar();
		
	}

	public static void jugar() {

		boolean ganado = false;
		intentoActual = 1;
		String palabraGuiones = ""; // palabra oculta que ira rellenándose con las letras acertadas
		char[] palabraAcertadas = new char[getPALABRA_ESCOGIDA().length()]; // array de letras acertadas
		String aux = ""; // Por si el usuario mete más de un caracter y para el Scanner
		char letraIntroducida;

		// Relleno con guiones bajos lo que se mostrará al usuario al inicio
		// Se ira rellenando con los caracteres acertados
		for (int i = 0; i < getPALABRA_ESCOGIDA().length(); i++) {
			palabraAcertadas[i] = '_';
			palabraGuiones += "_";
		}

		System.out.println("Empieza el juego");
		System.out.println("----------------");
		System.out.println("\nTienes " + INTENTOS_TOTALES + " intentos");
		System.out.println("Intento (" + intentoActual + "/" + INTENTOS_TOTALES + ")");
		System.out.println("\nPalabra a adivinar: " + palabraGuiones);
		System.out.println("\nPor favor, introduce una letra: ");

		while (!ganado && intentoActual <= INTENTOS_TOTALES) {

			aux = sc.next(); // Recogo lo metido por teclado en un String

			if (aux.length() == 1) {

				// Recogo la letra introducida a MAYUSCULAS
				letraIntroducida = Character.toUpperCase(aux.charAt(0));

				boolean letraAcertada = false;

				for (int i = 0; i < getPALABRA_ESCOGIDA().length(); i++) { // Compruebo si la letra introducida está en la palabra escogida
																		

					if (letraIntroducida == getPALABRA_ESCOGIDA().charAt(i)) {

						letraAcertada = true;
						palabraAcertadas[i] = letraIntroducida;

						palabraGuiones = "";
						for (int j = 0; j < palabraAcertadas.length; j++) {
							palabraGuiones += palabraAcertadas[j];
						}
					}

				} // termina for

				if (!letraAcertada) { // La letra no estaba en la palabra oculta
					intentoActual++;
					
					if (intentoActual > INTENTOS_TOTALES) { // compruebo si pierde (agota intentos)

						System.out.println("\n\n\nHAS SIDO AHORCADO, OTRA VEZ SERÁ");
						System.out.println("--------------------------------");
						System.out.println("\n\nLa palabra era: "+PALABRA_ESCOGIDA);
						System.out.println("\n-------Gracias por jugar--------");
						break; // salgo del bucle
					}
					
				}else { // La letra  SI estaba en la palabra oculta
					
					// Para comprobar si ha ganado comprueblo si quedan guiones en palabraGuiones, que es la palabra oculta que se va rellenando con las letras acertadas
					int guionesEncontrados = 0;
					for (int i = 0; i < palabraGuiones.length(); i++) {
						if (palabraGuiones.charAt(i) == '_') {
							guionesEncontrados++;
						}
					}
					
					if (guionesEncontrados == 0) { // No ha encontrado ninguno, gana el juego

						ganado = true;
						System.out.println(palabraGuiones);
						System.out.println("\nFELICIDADES, HAS SOBREVIVIDO AL AHORCADO");						
						break;
					
					}
				}
			// Si entra aquí aun quedan letras por descubrir sigue jugando
					
					System.out.println("Intento (" + intentoActual + "/" + INTENTOS_TOTALES + ")");
					System.out.println("Palabra a adivinar: " + palabraGuiones);

					System.out.println("\nIntroduce otra letra: ");

					

			} else { // Si ha introducido mas de una letra por teclado

				System.out.println("Recuerda introducir únicamente una letra, \nAdelante elige una");
			}
		}

		sc.close();

	}
	

	
	public static String getPALABRA_ESCOGIDA() {
		return PALABRA_ESCOGIDA;
	}

	public static void setPALABRA_ESCOGIDA(String pALABRA_ESCOGIDA) {
		PALABRA_ESCOGIDA = pALABRA_ESCOGIDA;
	}
}
