package com.example.demo.repository;

import java.util.List;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

import com.example.demo.model.Leito;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LeitoRepository {
    private static final int ZERO_BYTES = 0;
    private File arquivo = new File("src/main/resources/dataBase/tb_leitos.JSON");
    private ObjectMapper objectMapper = new ObjectMapper();

    public List<Leito> getAll() throws Exception{
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        List<Leito> leitos = null;

        if (arquivo.length() > ZERO_BYTES) {
             leitos = objectMapper.readValue(arquivo, new TypeReference<ArrayList<Leito>>() {});
        } else {
            leitos = new ArrayList<>();
        }

        
        return leitos;
    }

    public boolean save(Leito leito){
        for (Leito leitoNoBanco : leitos) {
            if (leitoNoBanco.getId() == leito.getId()) {
                return false; 
            }
        }
        leitos.add(leito);
        return true;
    }
}
