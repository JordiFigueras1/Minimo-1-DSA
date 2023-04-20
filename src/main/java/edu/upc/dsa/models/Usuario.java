package edu.upc.dsa.models;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
public class Usuario {

    Integer idUser;
    String username;
    Boolean currentlyPlaying;
    String surname1;
    String surname2;
    Integer vida;

    Integer dsaCoins;

    List<Producto> productos;

    public Usuario() {}

    public Usuario(String username) {
        this.setUsername(username);
        this.setCurrentlyPlaying(false);
        this.setFirstSurname(surname1);
        this.setSecondSurname(surname2);
        this.setUserid(idUser);
        this.setUservida(vida);
        this.setUserCoins(dsaCoins);
        this.setProductos(productos);
    }


    public String getUsername() {return username;}

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserid() {return idUser;}

    public void setUserid(Integer userid) {this.idUser = userid;}

    public Integer getUserCoins() {return dsaCoins;}

    public void setUserCoins(Integer coins) {this.dsaCoins = coins;}

    public Integer getUservida() {return vida;}

    public void setUservida(Integer vida) {this.vida = vida;}

    public String getFirstSurname() {
        return surname1;
    }

    public void setFirstSurname(String surname1) {
        this.surname1 = surname1;
    }

    public String getSecondSurname() {
        return surname2;
    }

    public void setNewpuntos(Integer newvida) {
        this.vida -= newvida;
    }
    public void setSecondSurname(String surname2) {
        this.surname2 = surname2;
    }
    public Boolean getCurrentlyPlaying() {
        return currentlyPlaying;
    }

    public void setCurrentlyPlaying(Boolean currentlyPlaying) {
        this.currentlyPlaying = currentlyPlaying;
    }
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    @Override
    public String toString() {
        return "Player [username=" + username +"]";
    }

}
