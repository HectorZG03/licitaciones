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

}
