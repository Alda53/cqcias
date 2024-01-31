package com.cqcias.backend.cqcias.alda.controller;

import com.cqcias.backend.cqcias.alda.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cqcias.backend.cqcias.alda.repository.PersonaRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonaController {
    @Autowired
    private PersonaRepository repository;

    @GetMapping("/personas")
    public List<Persona> listarActivos(){
        return repository.findByEstatus("1");

        //return repository.findAll();
    }
}
