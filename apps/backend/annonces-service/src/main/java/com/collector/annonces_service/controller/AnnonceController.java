package com.collector.annonces_service.controller;

import com.collector.annonces_service.model.Annonce;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/api/annonces/1")
    public Annonce getAnnonce() {
        Annonce annonce = new Annonce();
        annonce.setId(1L);
        annonce.setPrix(BigDecimal.valueOf(Math.random()));
        annonce.setDescription("Annonce sur les annonces Collector !");
        annonce.setTitre("Annonce sur les annonces Collector !");
        annonce.setStatut("ok");

        return annonce;
    }


}