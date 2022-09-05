package com.gm.mundopc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DispositivoEntradaTest {
    @Test
    void testGetMarca() {
        // Arrange
        DispositivoEntrada dispositivoEntrada = new DispositivoEntrada("Un tipo", "Una marca");
        String marca;

        // Act
        marca = dispositivoEntrada.getMarca();

        // Assert
        assertEquals("Una marca", marca);
    }

    @Test
    void testGetTipoEntrada() {
        // Arrange
        DispositivoEntrada dispositivoEntrada = new DispositivoEntrada("Un tipo", "Una marca");
        String tipo;

        // Act
        tipo = dispositivoEntrada.getTipoEntrada();

        // Assert
        assertEquals("Un tipo", tipo);

    }

    @Test
    void testSetMarca() {
        // Arrange
        DispositivoEntrada dispositivoEntrada = new DispositivoEntrada("Un tipo", "Una marca");
        String marca;

        // Act
        dispositivoEntrada.setMarca("Nueva marca!");
        marca = dispositivoEntrada.getMarca();

        // Assert
        assertEquals("Nueva marca!", marca);
    }

    @Test
    void testSetTipoEntrada() {
        // Arrange
        DispositivoEntrada dispositivoEntrada = new DispositivoEntrada("Un tipo", "Una marca");
        String tipo;

        // Act
        dispositivoEntrada.setTipoEntrada("Nuevo tipo!");
        tipo = dispositivoEntrada.getTipoEntrada();

        // Assert
        assertEquals("Nuevo tipo!", tipo);
    }

    @Test
    void testToString() {
        // Arrange
        DispositivoEntrada dispositivoEntrada = new DispositivoEntrada("Un tipo", "Una marca");
        String inString;

        // Act
        inString = dispositivoEntrada.toString();

        // Assert
        assertEquals("Nuevo tipo!", inString);
    }
}
