package com.autostock.api.controller;

import com.autostock.api.model.Box;
import com.autostock.api.services.BoxService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boxes")
@RequiredArgsConstructor
public class BoxController {
    private final BoxService boxService;

    @PostMapping
    public ResponseEntity<Box> criarBox(@RequestBody Box box) {
        Box novoBox = boxService.salvarBox(box);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoBox);
    }

    @GetMapping
    public ResponseEntity<List<Box>> listarBoxes() {
        List<Box> boxes = boxService.listarBoxes();
        return ResponseEntity.ok(boxes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Box> buscarBoxPorId(@PathVariable int id) {
        Box box = boxService.buscarPorId(id);
        return ResponseEntity.ok(box);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirBox(@PathVariable int id) {
        boxService.excluirBox(id);
        return ResponseEntity.noContent().build();
    }
}
