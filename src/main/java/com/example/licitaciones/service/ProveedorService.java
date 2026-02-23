package com.example.licitaciones.service;


import com.example.licitaciones.model.Proveedor;
import com.example.licitaciones.repository.ProveedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService {

    private final ProveedorRepository proveedorRepository;

    public ProveedorService(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    public List<Proveedor> findAll() {
        return proveedorRepository.findAll();
    }

    public Optional<Proveedor> findById(Long id) {
        return proveedorRepository.findById(id);
    }

    public Proveedor save(Proveedor proveedor) {
        if (proveedorRepository.existsByRfc(proveedor.getRfc())) {
            throw new IllegalArgumentException("Ya existe un proveedor con el RFC: " + proveedor.getRfc());
        }
        return proveedorRepository.save(proveedor);
    }

    public Proveedor update(Long id, Proveedor datos) {
        Proveedor existente = proveedorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Proveedor no encontrado con id: " + id));

        existente.setNombrePersonaFisica(datos.getNombrePersonaFisica());
        existente.setRfc(datos.getRfc());
        existente.setRazonSocial(datos.getRazonSocial());
        existente.setTelefonos(datos.getTelefonos());
        existente.setCorreo(datos.getCorreo());
        existente.setRepLegalNombre(datos.getRepLegalNombre());
        existente.setRepLegalCargo(datos.getRepLegalCargo());
        existente.setRepLegalRfc(datos.getRepLegalRfc());
        existente.setRepLegalDomicilio(datos.getRepLegalDomicilio());
        existente.setDomCalleNumero(datos.getDomCalleNumero());
        existente.setDomColonia(datos.getDomColonia());
        existente.setDomMunicipio(datos.getDomMunicipio());
        existente.setDomCp(datos.getDomCp());
        existente.setDomEstado(datos.getDomEstado());
        existente.setPadronNumCedula(datos.getPadronNumCedula());
        existente.setPadronVigencia(datos.getPadronVigencia());
        existente.setPadronRubros(datos.getPadronRubros());
        existente.setActaNumero(datos.getActaNumero());
        existente.setActaFecha(datos.getActaFecha());
        existente.setActaNotarioNombre(datos.getActaNotarioNombre());
        existente.setActaNotariaNumero(datos.getActaNotariaNumero());
        existente.setReformasNumero(datos.getReformasNumero());
        existente.setReformasFecha(datos.getReformasFecha());
        existente.setAccionistas(datos.getAccionistas());

        return proveedorRepository.save(existente);
    }

    public void delete(Long id) {
        if (!proveedorRepository.existsById(id)) {
            throw new RuntimeException("Proveedor no encontrado con id: " + id);
        }
        proveedorRepository.deleteById(id);
    }
}
