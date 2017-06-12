package com.utn.apiMail.model;

/**
 * Created by Gustavo on 6/6/2017.
 */
public class User {

    private int id;
    private String nombreUsuario;
    private String password;

    public User (){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
