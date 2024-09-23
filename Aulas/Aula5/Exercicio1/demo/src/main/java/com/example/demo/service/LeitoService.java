package com.example.demo.service;

import com.example.demo.model.Leito;
import com.example.demo.repository.LeitoRepository;

import java.util.List;

public class LeitoService {
    private LeitoRepository repository = new LeitoRepository();

    public List<Leito> listarTodosOsLeitos() {
        return repository.getAll();
    }

    public String cadastrarNovoLeito(Leito leito) {
        if (repository.save(leito)) {
            return "Leito " + leito.getId() + " foi cadastrado com sucesso!";
        }
        return "Leitos devem ter IDs unicos";
    }
}
