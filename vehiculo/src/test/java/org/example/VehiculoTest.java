package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class VehiculoTest {

    @Test
    void frenar_deberiaDisminuirVelocidad() {
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 100);
        v.acelerar(20);
        v.frenar(5);
        assertEquals(15, v.getVelocidad());
    }

    @Test
    void acelerar_deberiaAumentarVelocidad() {
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 100);
        v.acelerar(10);
        assertEquals(10, v.getVelocidad());
    }

    @Test
    void acelerar_noDeberiaSuperar_velocidadMaxima() {
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 100);
        v.acelerar(150);
        assertEquals(100, v.getVelocidad());
    }
}

