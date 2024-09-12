package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

import com.example.demo.model.Obra;
import com.example.demo.repository.ObraRepository;

import java.util.List;

@Component
public class ObraService {

    private ObraRepository obraRepository;

    @Autowired
    public ObraService(ObraRepository obraRepository) {
        this.obraRepository = obraRepository;
    }

    public List<Obra> listarObras() throws IOException {
        return obraRepository.getAll();
    }

    public Obra save(Obra obra) throws IOException {
        if (obraRepository.save(obra)) {
            return obra;
        }
        return null;
    }

    public Obra update(Obra obra) throws IOException {
        if (obraRepository.update(obra)) {
            return obra;
        }
        return null;

    }

}
