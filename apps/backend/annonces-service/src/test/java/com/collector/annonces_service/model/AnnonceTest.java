package com.collector.annonces_service.model;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnnonceTest {

    @Test
    void shouldCreateAnnonceWithCorrectValues() {
        Annonce annonce = new Annonce(
                1L,
                "Carte Pokémon Dracaufeu",
                "Carte en excellent état",
                new BigDecimal("149.99"),
                "ACTIVE"
        );

        assertEquals(1L, annonce.getId());
        assertEquals("Carte Pokémon Dracaufeu", annonce.getTitre());
        assertEquals("Carte en excellent état", annonce.getDescription());
        assertEquals(new BigDecimal("149.99"), annonce.getPrix());
        assertEquals("ACTIVE", annonce.getStatut());
    }
}