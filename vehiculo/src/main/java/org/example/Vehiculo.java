package org.example;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidadActual;
    private int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0;
    }

    public void acelerar(int incremento) {velocidadActual = Math.min(velocidadActual + incremento, velocidadMaxima);}
    public void frenar(int decremento) {velocidadActual = Math.max(velocidadActual - decremento, 0);}


    private boolean encendido = false;
    public void arrancar() {
        if (!encendido) {
            encendido = true;
        }
    }

    public boolean isEncendido() { return encendido; }
    public int getVelocidad() { return velocidadActual; }
    public int getVelocidadMaxima() { return velocidadMaxima; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public void detener() {
        velocidadActual = 0;
    }

}