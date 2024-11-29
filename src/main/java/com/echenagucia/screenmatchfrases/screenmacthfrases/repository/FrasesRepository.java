package com.echenagucia.screenmatchfrases.screenmacthfrases.repository;

import com.echenagucia.screenmatchfrases.screenmacthfrases.dto.FrasesDTO;
import com.echenagucia.screenmatchfrases.screenmacthfrases.model.Frases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FrasesRepository extends JpaRepository <Frases, Long>{


   @Query ("SELECT f FROM Frases f order by function ('RANDOM') LIMIT 1")
   public Frases obtenerFrase();
}
