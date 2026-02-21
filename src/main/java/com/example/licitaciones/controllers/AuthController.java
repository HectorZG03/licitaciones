package com.example.licitaciones.controllers;

import com.example.licitaciones.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UsuarioService usuarioService;

    public AuthController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> body){
        String nombreusuario = body.get("nombreusuario");
        String password = body.get("password");

        boolean success = usuarioService.login(nombreusuario, password);

        if (success){
            return ResponseEntity.ok(Map.of("message", "Login Exitoso"));
        }else {
            return ResponseEntity.status(401).body(Map.of("message", "Usuario o Contraseña Incorrectos"));
        }
    }
}
