package com.autostock.api.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

    public List<Box> listarBoxes(int id) {
        return boxRepository.getBoxsbyArmario(id);
    }

    public Box buscarPorId(int id) {
        return boxRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Box com ID " + id + " não encontrado."));
    }

    public void excluirBox(int id) {
        boxRepository.deleteById(id);
    }

    public void update(int id, Box box) {
        this.buscarPorId(id);
        boxRepository.save(box);
    }
}