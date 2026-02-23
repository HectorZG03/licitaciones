package com.example.licitaciones.controllers;

import com.example.licitaciones.model.Proveedor;
import com.example.licitaciones.service.ProveedorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {
    private final ProveedorService proveedorService;

    public ProveedorController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    // GET /proveedores → lista todos
    @GetMapping
    public ResponseEntity<List<Proveedor>> getAll() {
        return ResponseEntity.ok(proveedorService.findAll());
    }

    // GET /proveedores/{id} → obtiene uno por id
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return proveedorService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST /proveedores → registra nuevo proveedor
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Proveedor proveedor) {
        try {
            Proveedor saved = proveedorService.save(proveedor);
            return ResponseEntity.ok(saved);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(Map.of("message", e.getMessage()));
        }
    }

    // PUT /proveedores/{id} → actualiza proveedor existente
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Proveedor proveedor) {
        try {
            Proveedor updated = proveedorService.update(id, proveedor);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(Map.of("message", e.getMessage()));
        }
    }

    // DELETE /proveedores/{id} → elimina proveedor
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            proveedorService.delete(id);
            return ResponseEntity.ok(Map.of("message", "Proveedor eliminado correctamente"));
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(Map.of("message", e.getMessage()));
        }
    }
}
