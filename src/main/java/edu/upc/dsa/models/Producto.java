package edu.upc.dsa.models;

import java.util.ArrayList;
import java.util.List;
public class Producto {
    private String identificador;
    private int precio;
    private String descripcion;

    public Producto(String identificador, int precio, String descripcion) {
        this.identificador = identificador;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public static List<Producto> productosPorDefecto() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("P1", 50, "Espada"));
        productos.add(new Producto("P2", 40, "Hacha"));
        productos.add(new Producto("P3", 70, "Arco"));
        productos.add(new Producto("P4", 30, "Lanza"));
        return productos;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public int getPrecio() {
        return this.precio;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}





