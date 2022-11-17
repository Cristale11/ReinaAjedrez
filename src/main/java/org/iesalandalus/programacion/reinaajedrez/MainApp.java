package org.iesalandalus.programacion.reinaajedrez;

import java.util.Scanner;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	private Reina reina;
	private Consola consola;

	private static void ejecutarOpcion() {
		Scanner sc = new Scanner(System.in);
		int opcion;
		Consola.mostrarMenu();
		Consola.elegirOpcionMenu();
		opcion = sc.nextInt();
		do {
		switch (opcion) {
		case 1:
			crearReinaDefecto();
			break;
		case 2:
			Consola.elegirOpcion();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				crearReinaDefecto();
				break;
			case 2:
				crearReinaColor();
				break;
			}
			break;
		case 3:
			mover();
			break;
		case 4:
			Consola.despedirse();
			break;
		}
		}while (opcion != 4);

	}

	private static void crearReinaDefecto() {
		Reina reinadefecto = new Reina();

	}

	private static void crearReinaColor() {
		Reina reinanegra = new Reina(Color.NEGRO);
	}
	private static void mover() {
		Consola.mostrarMenuDirecciones();
		Consola.elegirDireccion();
		
	}
	public static void main(String[] args) {
		ejecutarOpcion();
		
	}
}
