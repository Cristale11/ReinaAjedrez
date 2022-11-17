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

	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if (direccion == null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		} else if (pasos <= 1 || pasos >= 7) {
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		}
        switch (direccion) {
        case NORTE:
            this.posicion = new Posicion(this.posicion.getFila() + pasos, this.posicion.getColumna());
            break;
        case NORESTE:
            this.posicion = new Posicion(this.posicion.getFila() + pasos, (char) (this.posicion.getColumna() + pasos));
            break;
        case NOROESTE:
        this.posicion = new Posicion(this.posicion.getFila() +pasos, (char) (this.posicion.getColumna() - pasos));
        break;
        case SUR:
            this.posicion = new Posicion(this.posicion.getFila() - pasos, this.posicion.getColumna());
        break;
        case SURESTE:
            this.posicion = new Posicion(this.posicion.getFila() - pasos, (char) (this.posicion.getColumna() + pasos));
        break;
        case SUROESTE:
            this.posicion = new Posicion(this.posicion.getFila() - pasos, (char) (this.posicion.getColumna() -pasos));
            break;
        case ESTE:
            this.posicion = new Posicion(this.posicion.getFila(), (char) (this.posicion.getColumna() + pasos));
            break;
        case OESTE:
            this.posicion= new Posicion(this.posicion.getFila(), (char) (this.posicion.getColumna() - pasos));
            break;
        }
	}

	@Override
	public String toString() {
		return "color=" + color + ", posicion=(" + posicion + ")";
	}

}
