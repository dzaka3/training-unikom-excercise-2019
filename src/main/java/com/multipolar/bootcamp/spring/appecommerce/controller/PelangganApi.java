package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Pelanggan;
import com.multipolar.bootcamp.spring.appecommerce.repository.PelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/pelanggan")
public class PelangganApi {

    @Autowired
    private PelangganRepository repository;

    @GetMapping("/list")
    public Iterable<Pelanggan> findAll() {return repository.findAll();}

    @GetMapping("/")
    public ResponseEntity<Pelanggan> save(
            @RequestBody Pelanggan pelanggan) {
        pelanggan = repository.save(pelanggan);
        return ResponseEntity.ok(pelanggan);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pelanggan> findById(
            @PathVariable("id") String PelangganId) {
        Optional<Pelanggan> pelangganOptional = repository.findById(PelangganId);
        if (pelangganOptional.isPresent())
            return ResponseEntity.ok(pelangganOptional.get());
        else
            return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(String id) {
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
