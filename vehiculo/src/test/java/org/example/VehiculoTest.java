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
}

