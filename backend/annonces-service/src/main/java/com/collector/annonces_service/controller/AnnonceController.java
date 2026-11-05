package com.collector.annonces_service.controller;

import com.collector.annonces_service.model.Annonce;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.collector.annonces_service.model.Annonce;

import java.math.BigDecimal;

@RestController
public class AnnonceController {

    @GetMapping("/api/annonces")
    public String getAnnonces() {
        return "Bienvenue sur les annonces Collector !";
    }

    @GetMapping("/api/annonces/bonjour")
    public String getAnnoncesBonjour() {
        return "Bienvenue sur Collector, la marketplace des passionnés !!";
    }

    @GetMapping("/api/annonces/{id}")
    public Annonce getAnnonce() {

        Annonce annonce = new Annonce(
                getAnnonce().getId(),
                getAnnonces(),
                "Carte Pokémon rare",
                new BigDecimal("350.00"),
                "EN_ATTENTE"
        );

        return annonce;
    }

}