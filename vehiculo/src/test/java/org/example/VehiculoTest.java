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

    @Test
    void frenar_noDeberiaSerNegativa() {
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 100);
        v.frenar(50);
        assertEquals(0, v.getVelocidad());
    }

    @Test
    void arrancar_deberiaEncenderElVehiculo() {
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 100);
        v.arrancar();
        assertEquals(true, v.isEncendido());
    }

    @Test
    void arrancar_noHaceNadaSiYaEstaEncendido() {
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 100);
        v.arrancar();
        v.arrancar();
        assertEquals(true, v.isEncendido());
    }
    @Test
    void detener_deberiaPonerVelocidadACero() {
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 100);
        v.acelerar(50);
        v.detener();
        assertEquals(0, v.getVelocidad());
    }

    @Test
    void detener_noApagaElVehiculo() {
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 100);
        v.arrancar();
        v.detener();
        assertTrue(v.isEncendido());
    }
}

