package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	private static int opcion1;

	private Consola() {

	}

	public static void mostrarMenu() {

		System.out.println("1.- Crear reina por defecto");
		System.out.println("2.- Crear reina eligiendo color");
		System.out.println("3.- Mover posicion");
		System.out.println("4.- Salir");
	}

	public static void elegirOpcionMenu() {
		System.out.print("Selecciona una opcion del menu:");

	}

	public static void elegirOpcion() {
		System.out.println("1.- Blanca");
		System.out.println("2.- Negra");
		System.out.print("Selecciona un color: ");
	}

	public static void mostrarMenuDirecciones() {
		System.out.println("Tipos de direcciones:");
		System.out.println("1.- NORTE");
		System.out.println("2.- NORESTE");
		System.out.println("3.- ESTE");
		System.out.println("4.- SURESTE");
		System.out.println("5.- SUR");
		System.out.println("6.- SUROESTE");
		System.out.println("7.- OESTE");
		System.out.println("8.- NOROESTE");
		System.out.print("Seleciona una direccion: ");
	}

	public static Direccion elegirDireccion() {
		int opcionDireccion;
		
		do {
			mostrarMenuDirecciones();
			opcionDireccion= Entrada.entero();
			} while (opcionDireccion <1 || opcionDireccion>8);
		switch (opcionDireccion) {
			case 1:
				return Direccion.NORTE;
			case 2:
				return Direccion.NORESTE;
			case 3:
				return Direccion.ESTE;
			case 4:
				return Direccion.SURESTE;
			case 5:
				return Direccion.SUR;
			case 6:
				return Direccion.SUROESTE;
			case 7:
				return Direccion.OESTE;
			case 8:
				return Direccion.NOROESTE;
			default:
				return Direccion.NORTE;
		
	}
		}

	public static int elegirPasos() {
		int pasos;
		System.out.print("Inserte el número de pasos porfavor: ");
		pasos = Entrada.entero();
		return pasos;
	
}
	public static void despedirse() {
		System.out.println("Adioossss");
	}
}
