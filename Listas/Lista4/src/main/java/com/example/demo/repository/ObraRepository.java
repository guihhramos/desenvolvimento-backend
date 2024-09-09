package com.example.demo.repository;

import java.io.File;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Obra;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ObraRepository {
    private static final int ZERO_BYTES = 0;
    private ObjectMapper objectMapper = new ObjectMapper();
    private File arquivo = new File("src/main/resources/database/tb_obras.json");

    public List<Obra> getAll() throws IOException {
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        if (arquivo.length() > ZERO_BYTES) {
            return objectMapper.readValue(arquivo, new TypeReference<List<Obra>>() {
            });
        }
        return new ArrayList<>();
    }

    public boolean save(Obra obra) throws IOException {
        List<Obra> obras = this.getAll();

        for (Obra obraNoDatabase : obras) {
            if (obra.getId() == obraNoDatabase.getId()) {
                return false;
            }
        }

        obras.add(obra);
        objectMapper.writeValue(arquivo, obras);
        return true;
    }

    public boolean update(Obra obra) throws IOException {
        List<Obra> obras = this.getAll();
        for (Obra obraNoDatabase : obras) {
            if (obra.getId() == obraNoDatabase.getId()) {
                obraNoDatabase.setJaFoiVendida(obra.jaFoiVendida());
                objectMapper.writeValue(arquivo, obras);
                return true;
            }
        }
        return false;
    }

}
