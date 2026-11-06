package com.collector.annonces_service.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(AnnonceController.class)
class AnnonceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnWelcomeMessage() throws Exception {
        mockMvc.perform(get("/api/annonces"))
                .andExpect(status().isOk())
                .andExpect(content().string("Bienvenue sur les annonces Collector !"));
    }

    @Test
    void shouldReturnBonjourMessage() throws Exception {
        mockMvc.perform(get("/api/annonces/bonjour"))
                .andExpect(status().isOk())
                .andExpect(content().string("Bienvenue sur Collector, la marketplace des passionnés !!"));
    }

    @Test
    void shouldReturnAnnonceById() throws Exception {
        mockMvc.perform(get("/api/annonces/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.titre").exists())
                .andExpect(jsonPath("$.description").exists())
                .andExpect(jsonPath("$.prix").exists())
                .andExpect(jsonPath("$.statut").exists());
    }
}