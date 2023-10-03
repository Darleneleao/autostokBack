package com.autostock.api.controller;

import com.autostock.api.model.Armario;
import com.autostock.api.services.ArmarioService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/armarios")
@RequiredArgsConstructor
public class ArmarioController {
    private final ArmarioService armarioService;

    @PostMapping
    public ResponseEntity<Armario> criarArmario(@RequestBody Armario armario) {
        Armario novoArmario = armarioService.salvarArmario(armario);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoArmario);
    }

    @GetMapping
    public ResponseEntity<List<Armario>> listarArmarios() {
        List<Armario> armarios = armarioService.listarArmarios();
        return ResponseEntity.ok(armarios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Armario> buscarArmarioPorId(@PathVariable int id) {
        Armario armario = armarioService.buscarPorId(id);
        return ResponseEntity.ok(armario);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> atualizaArmario(@PathVariable int id, @RequestBody Armario armario){
        armarioService.update(id, armario);
        return ResponseEntity.ok("Atualizado");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirArmario(@PathVariable int id) {
        armarioService.excluirArmario(id);
        return ResponseEntity.noContent().build();
    }
}
