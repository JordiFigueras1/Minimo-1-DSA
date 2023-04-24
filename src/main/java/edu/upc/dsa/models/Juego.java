package edu.upc.dsa.models;

import java.util.List;


public class Juego {
    List<Producto> productos;
    List<Equipo> equipos;
    String estado = "NO_INICIADO";
    Integer tamanoEquipo;

    public Juego() {}
    public Juego(List<Producto> productos, List<Equipo> equipos, int tamanoEquipo) {
        this.productos = productos;
        this.equipos = equipos;
        this.tamanoEquipo = tamanoEquipo;
    }

    // Métodos getter y setter para productos, equipos, estado y tamañoEquipo
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

    public int getTamanoEquipo() {
        return tamanoEquipo;
    }

    public void setTamanoEquipo(int tamanoEquipo) {
        this.tamanoEquipo = tamanoEquipo;
    }

    public int getNumeroEquipos() {
        return equipos.size();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}