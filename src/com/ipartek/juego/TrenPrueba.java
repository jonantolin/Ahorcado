package com.ipartek.juego;

import java.util.Scanner;

public class TrenPrueba {

	public static void main(String[] args) {
		
		Tren tren1 = new Tren();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tipo de tren: ");
		tren1.setTipo(sc.next());
		
		System.out.println("Introduce referencia: ");
		tren1.setReferencia(sc.next());
		
		System.out.println("Introduce asientos ocupados (billetes vendidos): ");
		tren1.setAsientosOcupados(sc.nextInt());
		
		System.out.println("Introduce asientos años en circulacion:  ");
		tren1.setAnosActivo(sc.nextInt());
		
		System.out.println(tren1);
		System.out.println(tren1.trenLleno());
		System.out.println(tren1.demasiadoViejo());
		
		sc.close();

	}

}
