package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

import java.util.ArrayList;
import java.util.List;


public class Partida {
    List<Producto> productos;
    List<Equipo> equipos;
    String estado = "NO_INICIADO";

    public Partida(List<Producto> productos, List<Equipo> equipos) {
        this.productos = productos;
        this.equipos = equipos;
    }

    // Métodos getter y setter para productos, equipos y estado
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}