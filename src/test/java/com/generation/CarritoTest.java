package com.generation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarritoTest {

    // Un carrito recién creado está vacío
    @Test
    void carritoNuevoEstaVacio() {
        // Organizar
        Carrito carrito1 = new Carrito();
        // Afirmar
        assertTrue(carrito1.estaVacio());
    }

    // Después de agregar un producto, la cantidad de productos es 1
    @Test
    void despuesDeAgregarUnProductoCantidadEsUno() {
        // Organizar
        Carrito carrito2 = new Carrito();
        Producto producto1 = new Producto("Manzana", 500, 3);
        // Actuar
        carrito2.agregar(producto1);
        // Afirmar
        assertEquals(1, carrito2.cantidadDeProductos());
    }

    // El total de un carrito con dos productos es la suma de sus precios
    @Test
    void totalConDosProductosEsLaSuma() {
        // Organizar
        Carrito carrito3 = new Carrito();
        Producto producto2 = new Producto("ProductoA", 100.0, 1);
        Producto producto3 = new Producto("ProductoB", 200.0, 1);
        // Actuar
        carrito3.agregar(producto2);
        carrito3.agregar(producto3);
        // Afirmar
        assertEquals(300.0, carrito3.calcularTotal());
    }

    // Un carrito con al menos un producto no está vacío
    @Test
    void carritoConUnProductoNoEstaVacio() {
        // Organizar
        Carrito carrito4 = new Carrito();
        Producto producto4 = new Producto("Pollo", 8000, 2);
        // Actuar
        carrito4.agregar(producto4);
        // Afirmar
        assertFalse(carrito4.estaVacio());
    }

    // El total de un carrito vacío es 0
    @Test
    void totalCarritoVacioEsCero() {
        // Organizar
        Carrito carrito5 = new Carrito();
        // Afirmar
        assertEquals(0, carrito5.calcularTotal());
    }
}