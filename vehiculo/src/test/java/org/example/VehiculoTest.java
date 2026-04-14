package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

class VehiculoTest {

    @Test
    void frenar_deberiaDisminuirVelocidad() {
        Vehiculo v = new Vehiculo();
        v.frenar(5);
        assertEquals(15, v.getVelocidad());
    }

    @Test
    void acelerar_deberiaAumentarVelocidad() {
        Vehiculo v = new Vehiculo();
        v.acelerar(10);
        assertEquals(10, v.getVelocidad());
    }
}

