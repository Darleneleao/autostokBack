package com.autostock.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.autostock.api.model.Componente;
import com.autostock.api.repository.ComponenteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ComponenteService {
    private final ComponenteRepository componenteRepository;

    public Componente salvarComponente(Componente componente) {
        return componenteRepository.save(componente);
    }

    public List<Componente> listarComponentes() {
        return componenteRepository.findAll();
    }

    public Componente buscarPorId(int id) {
        return componenteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Componente com ID " + id + " não encontrado."));
    }

    public void excluirComponente(int id) {
        componenteRepository.deleteById(id);
    }
}