package com.bravo.challenge.cobranzas.service;

import com.bravo.challenge.cobranzas.dtos.LoginRequest;
import com.bravo.challenge.cobranzas.dtos.LoginResponse;
import com.bravo.challenge.cobranzas.model.Usuario;
import com.bravo.challenge.cobranzas.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UsuarioRepository usuarioRepository;

    public AuthService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public LoginResponse login(LoginRequest request) {
        return usuarioRepository.findByUsername(request.getUsername())
                .filter(user -> user.getPassword().equals(request.getPassword()))
                .map(this::validarUsuario)
                .orElse(new LoginResponse("Usuario o contraseña incorrectos", false, null));
    }

    private LoginResponse validarUsuario(Usuario user) {

        if (!"COBRADOR".equalsIgnoreCase(user.getRol())) {
            return new LoginResponse("Solo cobradores pueden acceder al módulo", false, user.getRol());
        }

        if (!"ACTIVO".equalsIgnoreCase(user.getState())) {
            return new LoginResponse("Acceso denegado. Estado: " + user.getState(), false, user.getRol());
        }

        return new LoginResponse("Acceso concedido", true, user.getRol());
    }
}