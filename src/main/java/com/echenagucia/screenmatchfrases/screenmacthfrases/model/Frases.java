package com.echenagucia.screenmatchfrases.screenmacthfrases.model;

import jakarta.persistence.*;

@Entity
@Table (name = "frases")
public class Frases {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long Id;

    private String frase;
    private String personaje;
    private String titulo;;
    private String poster;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}