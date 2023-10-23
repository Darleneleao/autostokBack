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

    @GetMapping("/{id}")
    public ResponseEntity<List<Box>> listarBoxes(@PathVariable int id) {
        List<Box> boxes = boxService.listarBoxes(id);
        return ResponseEntity.ok(boxes);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizaArmario(@PathVariable int id, @RequestBody Box box){
        boxService.update(id, box);
        return ResponseEntity.ok("Atualizado");
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirBox(@PathVariable int id) {
        boxService.excluirBox(id);
        return ResponseEntity.noContent().build();
    }
}
