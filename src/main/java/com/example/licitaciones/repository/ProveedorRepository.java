package com.example.licitaciones.repository;

import com.example.licitaciones.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
    Optional<Proveedor> findByRfc(String rfc);
    boolean existsByRfc(String rfc);
}
