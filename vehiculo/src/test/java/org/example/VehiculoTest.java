package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

class VehiculoTest {

    @Test
    void acelerar_deberiaAumentarVelocidad() {
        Vehiculo v = new Vehiculo();
        v.acelerar(10);
        assertEquals(10, v.getVelocidad());
    }

    @Test
    void frenar_deberiaDisminuirVelocidad() {
        Vehiculo v = new Vehiculo();
        v.acelerar(10);
        v.frenar(5);
        assertEquals(5, v.getVelocidad());
    }

}

