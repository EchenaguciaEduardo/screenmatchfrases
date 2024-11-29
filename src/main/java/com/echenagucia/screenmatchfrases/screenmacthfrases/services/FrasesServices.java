package com.echenagucia.screenmatchfrases.screenmacthfrases.services;


import com.echenagucia.screenmatchfrases.screenmacthfrases.dto.FrasesDTO;
import com.echenagucia.screenmatchfrases.screenmacthfrases.model.Frases;
import com.echenagucia.screenmatchfrases.screenmacthfrases.repository.FrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FrasesServices {

    @Autowired
    private FrasesRepository frasesRepository;



    public FrasesDTO obtenerFrases(){
        Frases frases = frasesRepository.obtenerFrase();
        return new FrasesDTO(frases.getTitulo(), frases.getFrase(), frases.getPersonaje(), frases.getPoster());
    }

}
