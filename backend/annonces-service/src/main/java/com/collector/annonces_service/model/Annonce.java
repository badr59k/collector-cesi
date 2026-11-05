package com.collector.annonces_service.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Annonce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;
    private BigDecimal prix;
    private String statut;

    public Annonce(Long id, String titre, String description,
                   BigDecimal prix, String statut) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.prix = prix;
        this.statut = statut;
    }
}