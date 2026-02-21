package com.example.licitaciones.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nombreusuario;

    @Column(nullable = false)
    private String password;   // Más adelante se almacenará hasheada con BCrypt

    @Enumerated(EnumType.STRING)   // Guarda el nombre del enum en la BD
    @Column(nullable = false)
    private Role rol;

    // Constructor por defecto requerido por JPA
    public Usuario() {}

    // Constructor con campos
    public Usuario(String nombreusuario, String password, Role rol) {
        this.nombreusuario = nombreusuario;
        this.password = password;
        this.rol = rol;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRol() {
        return rol;
    }

    public void setRol(Role rol) {
        this.rol = rol;
    }
}