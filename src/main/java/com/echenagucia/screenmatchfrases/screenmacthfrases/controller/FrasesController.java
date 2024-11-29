package com.echenagucia.screenmatchfrases.screenmacthfrases.controller;

import com.echenagucia.screenmatchfrases.screenmacthfrases.dto.FrasesDTO;
import com.echenagucia.screenmatchfrases.screenmacthfrases.services.FrasesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/series")
@RestController
public class FrasesController {

    @Autowired
    private FrasesServices servicio;

    @GetMapping ("/frases")
    public FrasesDTO obtenerFrases(){
        return servicio.obtenerFrases();
    }




}
