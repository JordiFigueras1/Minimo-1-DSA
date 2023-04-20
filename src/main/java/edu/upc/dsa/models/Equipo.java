package edu.upc.dsa.models;

import java.util.ArrayList;
import java.util.List;
public class Equipo {
    List<Usuario> usuarios;
    Integer vidaEquipo;


    public Equipo() {}

    public Equipo(int cantidadUsuarios) {
        this.usuarios = new ArrayList<>();
        this.vidaEquipo = 0;

        for (int i = 0; i < cantidadUsuarios; i++) {
            Usuario usuario = new Usuario();
            this.usuarios.add(usuario);
            this.vidaEquipo += usuario.getUservida();
        }
    }

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public Integer getVidaEquipo() {
        return this.vidaEquipo;
    }
}