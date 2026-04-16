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

    public void acelerar(int cantidad) { velocidadActual += cantidad; }
    public void frenar(int cantidad) { velocidadActual -= cantidad; }
    public int getVelocidad() { return velocidadActual; }
    public int getVelocidadMaxima() { return velocidadMaxima; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
}