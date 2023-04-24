package edu.upc.dsa;

import edu.upc.dsa.models.Juego;
import edu.upc.dsa.models.Usuario;
import edu.upc.dsa.models.Producto;
import edu.upc.dsa.models.Equipo;

import java.util.*;

import org.apache.log4j.Logger;

import static java.lang.Integer.parseInt;

public class GameManagerImpl implements GameManager {

    private static GameManager instance;
    protected List<Usuario> usuarios;
    protected Juego partida;
    protected List<Producto> listaProductos;
    final static Logger logger = Logger.getLogger(GameManagerImpl.class);

    public GameManagerImpl() {
        this.usuarios = new ArrayList<>();
    }

    public static GameManager getInstance() {
        if (instance==null) instance = new GameManagerImpl();
        return instance;
    }
    @Override
    public Juego crearPartida(int cantidadUsuarios, int numeroEquipos) {

        List<Equipo> equipos = new ArrayList<>();
        for (int i = 1; i <= numeroEquipos; i++) {
            equipos.add(new Equipo(cantidadUsuarios));
        }

        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(0, 50, "Espada"));
        productos.add(new Producto(1, 40, "Hacha"));
        productos.add(new Producto(2, 70, "Arco"));
        productos.add(new Producto(3, 30, "Lanza"));

        return new Juego(productos, equipos, cantidadUsuarios);
    }


    @Override
    public void anadirProducto(Integer identificador,int precio, String descripcion) {
        Producto producto = new Producto(identificador, precio, descripcion);
        listaProductos.add(producto);
    }

    @Override
    public void anadirUsuario(int idUser, String nombre, String apellido1, String apellido2) {
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setIdUser(idUser);
        nuevoUsuario.setUsername(nombre);
        nuevoUsuario.setSurname1(apellido1);
        nuevoUsuario.setSurname2(apellido2);
        nuevoUsuario.setDsaCoins(25);
        usuarios.add(nuevoUsuario);
    }

    @Override
    public void comprarProducto(Integer idUser, Integer idProducto) {
        Usuario usuario = usuarios.get(idUser);
        Producto producto = listaProductos.get(idProducto);

        if (usuario == null || producto == null) {
            logger.info("Error: El usuario o el producto no existen");
            return;
        }

        if (usuario.getDsaCoins() < producto.getPrecio()) {
            logger.info("Error: El usuario no tiene suficientes dsaCoins para comprar el producto");
            return;
        }

        usuario.setDsaCoins(usuario.getDsaCoins() - producto.getPrecio());
        usuario.getProductos().add(producto);

        logger.info("El usuario " + usuario.getUsername() + " ha comprado el producto " + producto.getIdentificador() + " por " + producto.getPrecio() + " dsaCoins.");
    }

    @Override
    public void iniciarPartida(Integer idUsuario) {
        // Comprobar si existe un juego creado
        if (partida == null) {
            logger.info("Error: No hay ningún juego creado.");
            return;
        }

        // Comprobar si el usuario existe
        Usuario usuario = usuarios.get(idUsuario);
        if (usuario == null) {
            logger.info("Error: El usuario " + idUsuario + " no existe.");
            return;
        }

        // Comprobar si el usuario ya tiene una partida activa
        if (usuario.getCurrentlyPlaying()) {
            logger.info("Error: El usuario " + idUsuario + " ya tiene una partida activa.");
            return;
        }

        // Asignar al usuario a un equipo disponible
        for (int i = 1; i <= partida.getNumeroEquipos(); i++) {
            Equipo equipo = partida.getEquipos().get(i-1);
            if (equipo.getNumUsuarios() < partida.getNumJugadoresPorEquipo()) {
                equipo.add(usuario);
                usuario.setCurrentlyPlaying(true);
                logger.info("El usuario " + idUsuario + " ha sido añadido al equipo " + i + ".");
                break;
            }
        }

        // Comprobar si todos los equipos están completos para iniciar el juego
        boolean equiposCompletos = true;
        for (int i = 1; i <= partida.getNumeroEquipos(); i++) {
            if (partida.getEquipos().get(i-1).getNumUsuarios() < partida.getNumJugadoresPorEquipo()) {
                equiposCompletos = false;
                break;
            }
        }

        if (equiposCompletos) {
            partida.setEstado("INICIADO_EN_FUNCIONAMIENTO");
            logger.info("El juego ha sido iniciado en estado INICIADO_EN_FUNCIONAMIENTO.");
        }
    }
}

