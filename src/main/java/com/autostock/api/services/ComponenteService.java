package com.autostock.api.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.autostock.api.dtos.ComponenteDto;
import com.autostock.api.model.Armario;
import com.autostock.api.model.Box;
import com.autostock.api.model.Componente;
import com.autostock.api.repository.ArmarioRepository;
import com.autostock.api.repository.BoxRepository;
import com.autostock.api.repository.ComponenteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ComponenteService {
    private final ComponenteRepository componenteRepository;
    private final BoxRepository boxRepository;
    private final ArmarioRepository armarioRepository;



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

    public List<ComponenteDto> pesquisarComponente(String nome) {
        List<Componente> listaComponentes = componenteRepository.findByNomeContaining(nome);
        List<ComponenteDto> lComponenteDtos = new ArrayList<>();
        for (Componente componente : listaComponentes) {
            lComponenteDtos.add(this.toDto(componente));
        }
        return lComponenteDtos;

    }

    public ComponenteDto toDto(Componente componente) {
        Box box = boxRepository.findById(Integer.parseInt(componente.getBoxId().toString()) ).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Box com ID " + componente.getBoxId() + " não encontrado."));
        Armario armario = armarioRepository.findById(Integer.parseInt(box.getArmarioId().toString())).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Armario com ID " + box.getArmarioId() + " não encontrado."));
        return new ComponenteDto(componente.getNome(), componente.getDescricao(), componente.getQuantidade(), armario.getDescricao(), box.getDescricao());
    }
    
}