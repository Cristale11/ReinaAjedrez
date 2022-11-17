package org.iesalandalus.programacion.reinaajedrez;

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
		System.out.println("Selecciona una opcion del menu:");

	}

	public static void elegirOpcion() {
		System.out.println("Selecciona un color");
		System.out.println("1.- Rojo");
		System.out.println("2.- Azul");
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
	}

	public static void elegirDireccion() {
		System.out.println("Selecciona la direccion");
		System.out.println("Introduce una opcion valida: ");
	}

	public static void elegirPasos() {
		System.out.println("Selecciona la cantidad de pasos que quieras dar");

	}
	public static void despedirse() {
		System.out.println("Adioossss");
	}
}
