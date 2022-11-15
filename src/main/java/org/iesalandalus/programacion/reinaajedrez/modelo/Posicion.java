package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

}
