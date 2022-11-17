package org.iesalandalus.programacion.reinaajedrez;

import java.util.Scanner;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	private Reina reina;
	private Consola consola;

	private static void crearReinaDefecto() {
		Reina reinadefecto = new Reina();

	}

	private static void crearReinaColor() {
		Reina reinanegra = new Reina(Color.NEGRO);
		reinanegra.getColor();
	}

	private static void mover() { // Preguntar duda
		Consola.mostrarMenuDirecciones();
		Consola.elegirDireccion();

	}

	private static void mostrarReina() { // Preguntar duda

	}

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
		} while (opcion != 4);

	}

	public static void main(String[] args) {
		ejecutarOpcion();

	}
}
