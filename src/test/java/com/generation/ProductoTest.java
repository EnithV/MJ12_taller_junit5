package com.generation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    // El precio de un producto es el que se pasó al constructor.
    @Test
    void precioConstructor() {
        // Organizar
        double precio = 2100;
        Producto producto = new Producto("Cheetos", precio, 15);
        // Actuar
        double precioObtenido = producto.getPrecio();
        // Afirmar
        assertEquals(precio, precioObtenido);
    }

    // Un producto con stock mayor a cero está disponible
    @Test
    void estaDisponible() {
        // Organizar
        double precio = 49900;
        int stock = 100;
        Producto producto2 = new Producto("Bonbonbum", precio, stock);
        // Actuar
        boolean disponible = producto2.estaDisponible();
        // Afirmar
        assertTrue(disponible);
    }

    // Un producto con stock igual a cero no está disponible
    @Test
    void noDisponibleCuandoStockCero() {
        // Organizar
        double precio = 28600;
        int stock = 0;
        Producto producto3 = new Producto("Café", precio, stock);
        // Actuar
        boolean noDisponible = producto3.estaDisponible();
        // Afirmar
        assertFalse(noDisponible);
    }

    // Después de reducir el stock en una cantidad válida, el stock disminuye correctamente
    @Test
    void stockDisminuyeCorrectamente() {
        // Organizar
        double precio = 11800;
        int stock = 10;
        Producto producto4 = new Producto("Chocolate", precio, stock);
        // Actuar
        producto4.reducirStock(3);
        // Afirmar
        assertEquals(7, producto4.getStock());
    }

    // Intentar reducir el stock más de lo disponible lanza IllegalArgumentException
    @Test
    void reducirStockInsuficienteLanzaExcepcion() {
        // Organizar
        double precio = 12000;
        int stock = 5;
        Producto producto5 = new Producto("Galletas", precio, stock);
        // Actuar y Afirmar
        assertThrows(IllegalArgumentException.class, () -> {
            producto5.reducirStock(10);
        });
    }

    // Crear un producto con precio negativo lanza IllegalArgumentException
    @Test
    void precioNegativoLanzaExcepcion() {
        // Organizar
        double precioNegativo = -500;
        int stock = 10;
        // Actuar y Afirmar
        assertThrows(IllegalArgumentException.class, () -> {
            Producto producto6 = new Producto("ProductoMal", precioNegativo, stock);
        });
    }

    // Prueba libre
    // ¿Qué comportamiento están probando?
    // Que el método getNombre devuelve el nombre que se pasó al constructor
    // ¿Qué aserción van a usar y por qué?
    // assertEquals porque quiero verificar un valor exacto (el nombre)
    // ¿Qué valor esperan obtener?
    // "Chokis"
    @Test
    void getNombreDevuelveElNombreCorrecto() {
        // Organizar
        String nombreEsperado = "Chokis";
        double precio = 1900.0;
        int stock = 8;
        Producto producto7 = new Producto(nombreEsperado, precio, stock);
        // Actuar
        String nombreObtenido = producto7.getNombre();
        // Afirmar
        assertEquals(nombreEsperado, nombreObtenido);
    }
}