package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

class VehiculoTest {

    @Test
    void frenar_deberiaDisminuirVelocidad() {
        Vehiculo v = new Vehiculo();
        v.frenar(5);
        assertEquals(5, v.getVelocidad());
    }
}

