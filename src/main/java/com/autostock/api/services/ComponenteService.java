package com.autostock.api.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

    public List<Componente> listarComponentes(int id) {
        return componenteRepository.getComponentesByBox(id);
    }

    public Componente buscarPorId(int id) {
        return componenteRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Componente com ID " + id + " não encontrado."));
    }

    public void excluirComponente(int id) {
        componenteRepository.deleteById(id);
    }

    public void update(int id, Componente componente) {
        this.buscarPorId(id);
        componenteRepository.save(componente);
    }
}