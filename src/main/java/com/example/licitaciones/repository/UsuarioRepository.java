package com.example.licitaciones.repository;

import com.example.licitaciones.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByNombreusuario(String nombreusuario);
}