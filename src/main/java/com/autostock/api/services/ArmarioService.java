package com.autostock.api.services;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.autostock.api.model.Armario;
import com.autostock.api.repository.ArmarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArmarioService {
    private final ArmarioRepository armarioRepository;

    

    public Armario salvarArmario(Armario armario) {
        return armarioRepository.save(armario);
    }

    public List<Armario> listarArmarios() {
        return armarioRepository.findAll();
    }

    public Armario buscarPorId(int id) {
        return armarioRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND ,"Armario com ID " + id + " não encontrado."));
    }

    public void update(int id, Armario armario){
        this.buscarPorId(id);
        armarioRepository.save(armario);
    }

    public void excluirArmario(int id) {
        armarioRepository.deleteById(id);
    }
}