package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
private Color color; //Preguntar si es privado o no
private Posicion posicion; //Preguntar si es privado o no

public Color getColor() {
	return color;
}
private void setColor(Color color) {
	if (color == null) {
		throw new NullPointerException("El color no puede ser nulo"); //No se sabe si hay que poner esto.
	}
	this.color = color;
}
public Posicion getPosicion() {
	return posicion;
}
private void setPosicion(Posicion posicion) {
	if (posicion == null) {
		throw new NullPointerException("La posicion no puede ser nula"); //No se sabe si hay que poner esto
	}
	this.posicion = posicion;
}

}
