package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {
	private Color color; // Preguntar si es privado o no
	private Posicion posicion; // Preguntar si es privado o no

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		if (color == null) {
			throw new NullPointerException("ERROR: El color no puede ser nulo."); // No se sabe si hay que poner esto.
		}
		this.color = color;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula."); // No se sabe si hay que poner
																						// esto
		}
		this.posicion = posicion;
	}

	public Reina() {
		color = color.BLANCO;
		posicion = new Posicion(1, 'd');
	}

	public Reina(Color color) {
		setColor(color);
		if (color == Color.BLANCO) {
			posicion = new Posicion(1, 'd');
		} else if (color == Color.NEGRO) {
			posicion = new Posicion(8, 'd');
		}
	}

	public void mover(Direccion direccion, int Pasos) throws OperationNotSupportedException {
		if (direccion == null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		} else if (Pasos <= 1 || Pasos >= 7) {
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		}
		switch (direccion) {
		case NORTE:
			if (color == Color.BLANCO) {
				posicion = new Posicion(2, 'd');
			} else if (color == Color.NEGRO) {
				posicion = new Posicion(8, 'a');
			}
		case NORESTE:
			if (color == Color.BLANCO) {
				posicion = new Posicion(3, 'e');
			}
		case ESTE:
			if (color == Color.BLANCO) {
				posicion = new Posicion(3, 'f');
			}
		case SURESTE:
			if (color == Color.BLANCO) {
				posicion = new Posicion(2, 'g');
			}
		case SUR:
			if (color == Color.BLANCO) {
				posicion = new Posicion(1, 'g');
			} else if (color == Color.NEGRO) {
				posicion = new Posicion(7, 'd');
			}
		case SUROESTE:
			if (color == Color.NEGRO) {
				posicion = new Posicion(6, 'c');
			}
		case OESTE:
			if (color == Color.NEGRO) {
				posicion = new Posicion(6, 'b');
			}
		case NOROESTE:
			if (color == Color.NEGRO) {
				posicion = new Posicion(7, 'a');
			}
		}
	}

	@Override
	public String toString() {
		return "color=" + color + ", posicion=(" + posicion + ")";
	}

}
