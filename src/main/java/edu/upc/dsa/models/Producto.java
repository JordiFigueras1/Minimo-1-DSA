package edu.upc.dsa.models;

import java.util.ArrayList;
import java.util.List;
public class Producto {
    private Integer identificador;
    private int precio;
    private String descripcion;

    public Producto() {}
    public Producto(Integer identificador, int precio, String descripcion) {
        this.identificador = identificador;
        this.precio = precio;
        this.descripcion = descripcion;
    }


    public Integer getIdentificador() {
        return this.identificador;
    }

    public int getPrecio() {
        return this.precio;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}





