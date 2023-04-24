package edu.upc.dsa.models;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
public class Usuario {

    private Integer idUser;
    private String username;
    private Boolean currentlyPlaying;
    private String surname1;
    private String surname2;
    private Integer vida;
    private Integer dsaCoins;

    private List<Producto> productos;

    public Usuario() {}

    public Usuario(Integer idUser, String username, String surname1, String surname2) {
        this.idUser = idUser;
        this.username = username;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.currentlyPlaying = false;
        this.vida = 100;
        this.dsaCoins = 25;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getCurrentlyPlaying() {
        return currentlyPlaying;
    }

    public void setCurrentlyPlaying(Boolean currentlyPlaying) {
        this.currentlyPlaying = currentlyPlaying;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getDsaCoins() {
        return dsaCoins;
    }

    public void setDsaCoins(Integer dsaCoins) {
        this.dsaCoins = dsaCoins;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void addProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void removeProducto(Producto producto) {
        this.productos.remove(producto);
    }

    public void incrementarDsaCoins(Integer cantidad) {
        this.dsaCoins += cantidad;
    }

    public void decrementarDsaCoins(Integer cantidad) {
        this.dsaCoins -= cantidad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUser=" + idUser +
                ", username='" + username + '\'' +
                ", currentlyPlaying=" + currentlyPlaying +
                ", surname1='" + surname1 + '\'' +
                ", surname2='" + surname2 + '\'' +
                ", vida=" + vida +
                ", dsaCoins=" + dsaCoins +
                '}';
    }
}


