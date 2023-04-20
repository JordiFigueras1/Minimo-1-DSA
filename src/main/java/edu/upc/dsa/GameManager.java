package edu.upc.dsa;

import edu.upc.dsa.models.Partida;
import edu.upc.dsa.models.Exceptions.*;
import edu.upc.dsa.models.Producto;

import java.util.List;

public interface GameManager {

    // Creación de una partida
    public Partida createPartida (String id, String description, Integer num) throws PartidaEnActivoException;

    public void anadirProducto(List<Producto> productos, String identificador, int precio, String descripcion);
    public Partida createUser(String idUser, String iduser);


}
