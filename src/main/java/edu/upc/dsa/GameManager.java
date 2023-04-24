package edu.upc.dsa;

import edu.upc.dsa.models.Juego;
import edu.upc.dsa.models.Usuario;
import edu.upc.dsa.models.Equipo;
import edu.upc.dsa.models.Exceptions.*;
import edu.upc.dsa.models.Producto;

import java.util.List;

public interface GameManager {

    // Creación de una partida
    public Juego crearPartida(int cantidadUsuarios, int numeroEquipos) throws PartidaEnActivoException;

    public void anadirProducto(Integer identificador, int precio, String descripcion);
    public void anadirUsuario(int idUser, String nombre, String apellido1, String apellido2);

    public void comprarProducto(Integer idUser, Integer idProducto);

    void iniciarPartida(Integer idUsuario);
}
