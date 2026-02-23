package com.example.licitaciones.model;

import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "proveedores")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Datos de la Columna proveedores;

    @Column(name = "nombre_persona_fisica")
    private String nombrePersonaFisica;

    @Column(name = "rfc", nullable = false)
    private String rfc;

    @Column(name = "razon_social")
    private String razonSocial;

    @Column(name = "telefonos", nullable = false)
    private String telefonos;

    @Column(name = "correo", nullable = false)
    private String correo;

    // Representante legal
    @Column(name = "rep_legal_nombre")
    private String repLegalNombre;

    @Column(name = "rep_legal_cargo")
    private String repLegalCargo;

    @Column(name = "rep_legal_rfc")
    private String repLegalRfc;

    @Column(name = "rep_legal_domicilio", columnDefinition = "TEXT")
    private String repLegalDomicilio;

    // Domicilio
    @Column(name = "dom_calle_numero", nullable = false)
    private String domCalleNumero;

    @Column(name = "dom_colonia", nullable = false)
    private String domColonia;

    @Column(name = "dom_municipio", nullable = false)
    private String domMunicipio;

    @Column(name = "dom_cp", nullable = false)
    private String domCp;

    @Column(name = "dom_estado", nullable = false)
    private String domEstado;

    // Padrón de proveedores
    @Column(name = "padron_num_cedula")
    private String padronNumCedula;

    @Column(name = "padron_vigencia")
    private LocalDate padronVigencia;

    @Column(name = "padron_rubros", columnDefinition = "TEXT")
    private String padronRubros;

    // Acta constitutiva
    @Column(name = "acta_numero")
    private String actaNumero;

    @Column(name = "acta_fecha")
    private LocalDate actaFecha;

    @Column(name = "acta_notario_nombre")
    private String actaNotarioNombre;

    @Column(name = "acta_notaria_numero")
    private String actaNotariaNumero;

    // Reformas
    @Column(name = "reformas_numero")
    private String reformasNumero;

    @Column(name = "reformas_fecha")
    private LocalDate reformasFecha;

    // Accionistas
    @Column(name = "accionistas", columnDefinition = "TEXT")
    private String accionistas;

    // ── Constructores ──
    public Proveedor() {}

    // ── Getters y Setters ──
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombrePersonaFisica() { return nombrePersonaFisica; }
    public void setNombrePersonaFisica(String nombrePersonaFisica) { this.nombrePersonaFisica = nombrePersonaFisica; }

    public String getRfc() { return rfc; }
    public void setRfc(String rfc) { this.rfc = rfc; }

    public String getRazonSocial() { return razonSocial; }
    public void setRazonSocial(String razonSocial) { this.razonSocial = razonSocial; }

    public String getTelefonos() { return telefonos; }
    public void setTelefonos(String telefonos) { this.telefonos = telefonos; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getRepLegalNombre() { return repLegalNombre; }
    public void setRepLegalNombre(String repLegalNombre) { this.repLegalNombre = repLegalNombre; }

    public String getRepLegalCargo() { return repLegalCargo; }
    public void setRepLegalCargo(String repLegalCargo) { this.repLegalCargo = repLegalCargo; }

    public String getRepLegalRfc() { return repLegalRfc; }
    public void setRepLegalRfc(String repLegalRfc) { this.repLegalRfc = repLegalRfc; }

    public String getRepLegalDomicilio() { return repLegalDomicilio; }
    public void setRepLegalDomicilio(String repLegalDomicilio) { this.repLegalDomicilio = repLegalDomicilio; }

    public String getDomCalleNumero() { return domCalleNumero; }
    public void setDomCalleNumero(String domCalleNumero) { this.domCalleNumero = domCalleNumero; }

    public String getDomColonia() { return domColonia; }
    public void setDomColonia(String domColonia) { this.domColonia = domColonia; }

    public String getDomMunicipio() { return domMunicipio; }
    public void setDomMunicipio(String domMunicipio) { this.domMunicipio = domMunicipio; }

    public String getDomCp() { return domCp; }
    public void setDomCp(String domCp) { this.domCp = domCp; }

    public String getDomEstado() { return domEstado; }
    public void setDomEstado(String domEstado) { this.domEstado = domEstado; }

    public String getPadronNumCedula() { return padronNumCedula; }
    public void setPadronNumCedula(String padronNumCedula) { this.padronNumCedula = padronNumCedula; }

    public LocalDate getPadronVigencia() { return padronVigencia; }
    public void setPadronVigencia(LocalDate padronVigencia) { this.padronVigencia = padronVigencia; }

    public String getPadronRubros() { return padronRubros; }
    public void setPadronRubros(String padronRubros) { this.padronRubros = padronRubros; }

    public String getActaNumero() { return actaNumero; }
    public void setActaNumero(String actaNumero) { this.actaNumero = actaNumero; }

    public LocalDate getActaFecha() { return actaFecha; }
    public void setActaFecha(LocalDate actaFecha) { this.actaFecha = actaFecha; }

    public String getActaNotarioNombre() { return actaNotarioNombre; }
    public void setActaNotarioNombre(String actaNotarioNombre) { this.actaNotarioNombre = actaNotarioNombre; }

    public String getActaNotariaNumero() { return actaNotariaNumero; }
    public void setActaNotariaNumero(String actaNotariaNumero) { this.actaNotariaNumero = actaNotariaNumero; }

    public String getReformasNumero() { return reformasNumero; }
    public void setReformasNumero(String reformasNumero) { this.reformasNumero = reformasNumero; }

    public LocalDate getReformasFecha() { return reformasFecha; }
    public void setReformasFecha(LocalDate reformasFecha) { this.reformasFecha = reformasFecha; }

    public String getAccionistas() { return accionistas; }
    public void setAccionistas(String accionistas) { this.accionistas = accionistas; }

}

