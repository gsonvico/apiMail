package com.utn.apiMail.util;


import com.utn.apiMail.model.User;
import org.joda.time.DateTime;

/**
 * Created by pablo on 01/11/16.
 */
public class AuthenticationData {

    private User usuario;
    private DateTime lastAction;

    public DateTime getLastAction() {
        return lastAction;
    }

    public void setLastAction(DateTime lastAction) {
        this.lastAction = lastAction;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }
}
