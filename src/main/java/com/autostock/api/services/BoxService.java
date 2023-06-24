package com.autostock.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.autostock.api.model.Box;
import com.autostock.api.repository.BoxRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoxService {
    private final BoxRepository boxRepository;


    public Box salvarBox(Box box) {
        return boxRepository.save(box);
    }

    public List<Box> listarBoxes() {
        return boxRepository.findAll();
    }

    public Box buscarPorId(int id) {
        return boxRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Box com ID " + id + " não encontrado."));
    }

    public void excluirBox(int id) {
        boxRepository.deleteById(id);
    }
}