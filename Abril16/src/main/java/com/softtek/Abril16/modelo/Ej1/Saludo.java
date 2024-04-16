package com.softtek.Abril16.modelo.Ej1;

import org.springframework.stereotype.Component;

@Component
public class Saludo {
    private String mensaje;

    public Saludo() {
        this.mensaje = "¡Bienvenido!";
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
