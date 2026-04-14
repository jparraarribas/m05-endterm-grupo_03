package org.example;

public class Vehiculo {

    private int velocidad = 20;
    public void frenar(int cantidad) {
        velocidad -= cantidad;
    }

    public void acelerar(int cantidad) {
        velocidad += cantidad;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
