package org.example;

public class Vehiculo {
    private int velocidad = 0;

    public void acelerar(int cantidad) {
        velocidad += cantidad;
    }

    public int getVelocidad() {
        return velocidad;

    }
}
