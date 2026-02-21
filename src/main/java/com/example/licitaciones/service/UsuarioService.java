package com.example.licitaciones.service;

import com.example.licitaciones.model.Usuario;
import com.example.licitaciones.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository =usuarioRepository;
    }

    public boolean login(String nombreusuario, String password){
        Optional<Usuario> usuarioOpt = usuarioRepository.findByNombreusuario(nombreusuario);
        return usuarioOpt.map(usuario -> usuario.getPassword().equals(password)).orElse(false);
    }
}
