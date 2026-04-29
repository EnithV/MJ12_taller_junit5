package com.generation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {
    // El precio de un producto es el que se pasó al constructor. Escribo cualquier valor
    // será el mismo que obtiene getPrecio()
    @Test
    void precioConstructor () {
        // Organizar
        double precio = 2100;
        // Actuar: creo el producto
        Producto producto = new Producto("Cheetos", precio, 15);
        // Afirmar: verifico que el precio se guardó
        assertEquals(precio, producto.getPrecio());
    }
    // Un producto con stock mayor a cero está disponible (estaDisponible() devuelve true).


}
