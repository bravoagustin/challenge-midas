package com.bravo.challenge.cobranzas.dtos;

public class LoginResponse {
    private String message;
    private boolean access;
    private String rol;

    public LoginResponse(String message, boolean access, String rol) {
        this.message = message;
        this.access = access;
        this.rol = rol;
    }

    // getters
    public String getMessage() {
        return message;
    }

    public boolean isAccess() {
        return access;
    }

    public String getRol() {
        return rol;
    }
}
