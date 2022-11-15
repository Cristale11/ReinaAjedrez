package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {
	private int fila;
	private char columna;

	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {
		if (fila >= 1 && fila <= 8) {
			this.fila = fila;
		} else {
			throw new IllegalArgumentException("La fila se sale de los valores permitidos");
		}
	}

	public char getColumna() {
		return columna;
	}

	private void setColumna(char columna) {
		if (columna >= 'a' && columna <= 'h') {
			this.columna = columna;
		} else {
			throw new IllegalArgumentException("La columna se sale de los valores permitidos");
		}

	}

	public Posicion(int fila, char columna) {
		setColumna(columna);
		setFila(fila);
	}
	
	public Posicion(Posicion posicion) {
	fila = posicion.getFila();
	columna = posicion.getColumna();
	}

}
