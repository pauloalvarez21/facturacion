package com.gae.facturacion.auth.service;

import com.gae.facturacion.auth.dto.LoginRequest;
import com.gae.facturacion.auth.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<String> login(LoginRequest request) {
        // Autenticación simplificada: usuario "admin" y contraseña "password"
        if ("admin".equals(request.getUsername()) && "password".equals(request.getPassword())) {
            return ResponseEntity.ok("Login exitoso");
        }
        return ResponseEntity.status(401).body("Credenciales inválidas");
    }
}
