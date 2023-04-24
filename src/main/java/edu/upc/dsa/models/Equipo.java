package edu.upc.dsa.models;

import java.util.ArrayList;
import java.util.List;
public class Equipo {
    List<Usuario> usuarios;
    Integer vidaEquipo;


    public Equipo() {}
    public Equipo(int tamañoEquipo) {
        this.usuarios = new ArrayList<>();
        this.vidaEquipo = 0;

        for (int i = 0; i < tamañoEquipo; i++) {
            Usuario usuario = new Usuario();
            this.usuarios.add(usuario);
            this.vidaEquipo += usuario.getVida();
        }
    }

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public Integer getVidaEquipo() {
        return this.vidaEquipo;
    }

    public int getTamañoEquipo() {
        return this.usuarios.size();
    }
}