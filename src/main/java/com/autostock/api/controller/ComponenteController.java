package com.autostock.api.controller;

import com.autostock.api.model.Componente;
import com.autostock.api.services.ComponenteService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/componentes")
@RequiredArgsConstructor
public class ComponenteController {
    private final ComponenteService componenteService;
    @PostMapping
    public ResponseEntity<Componente> criarComponente(@RequestBody Componente componente) {
        Componente novoComponente = componenteService.salvarComponente(componente);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoComponente);
    }

    @GetMapping
    public ResponseEntity<List<Componente>> listarComponentes() {
        List<Componente> componentes = componenteService.listarComponentes();
        return ResponseEntity.ok(componentes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Componente> buscarComponentePorId(@PathVariable int id) {
        Componente componente = componenteService.buscarPorId(id);
        return ResponseEntity.ok(componente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirComponente(@PathVariable int id) {
        componenteService.excluirComponente(id);
        return ResponseEntity.noContent().build();
    }
}
