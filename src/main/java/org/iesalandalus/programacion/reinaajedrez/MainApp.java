package org.iesalandalus.programacion.reinaajedrez;

import java.util.Scanner;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	
	private static  Reina reina;
	private Consola consola;
	static int opcion;
	
	private static void crearReinaDefecto() {
		reina = new Reina();

	}

	private static void crearReinaColor() { 
		reina = new Reina(Color.NEGRO);
	}

    private static void mover() {
        try {
            reina.mover(Consola.elegirDireccion(), Consola.elegirPasos());
        } catch (OperationNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

	private static void mostrarReina() {
        if (reina == null) {
            throw new NullPointerException("No existe reina aún.");
	}
		System.out.println(reina);
	}
	private static void ejecutarOpcion() {
		Scanner sc = new Scanner(System.in);
		Consola.mostrarMenu();
		Consola.elegirOpcionMenu();
		opcion = sc.nextInt();
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
	
	}
	public static void main(String[] args) {

	do {
		ejecutarOpcion();
		mostrarReina();
	}while(MainApp.opcion != 4);

	}
}
