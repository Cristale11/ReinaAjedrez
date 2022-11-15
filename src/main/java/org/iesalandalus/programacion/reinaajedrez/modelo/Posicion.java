package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {
private int fila;
private char Columna;

public int getFila() {
	return fila;
}
private void setFila(int fila) {
	if (fila >= 1 && fila <= 8) {
		this.fila = fila;
	}else {
		throw new IllegalArgumentException("La fila se sale de los valores permitidos");
	}
}
public char getColumna() {
	return Columna;
}
private void setColumna(char columna) {
	if (columna >= 'a' && columna <= 'h') {
	this.Columna = columna;
}else {
	throw new IllegalArgumentException("La columna se sale de los valores permitidos");
	}
}


}
