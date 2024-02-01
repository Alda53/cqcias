package com.cqcias.backend.cqcias.alda.controller;

import com.cqcias.backend.cqcias.alda.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.cqcias.backend.cqcias.alda.repository.PersonaRepository;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api")
public class PersonaController {
    @Autowired
    private PersonaRepository repository;

    //Método para listar empleados activos
    @GetMapping("/personas")
    public List<Persona> listarActivos(){
        return repository.findByEstatus("1");

        //return repository.findAll();
    }

    //Método registro
    @PostMapping("/personas")
    public Persona guardarPersona(@RequestBody Persona persona){
        return repository.save(persona);
    }

    //Método ver un persona por ID
    @GetMapping("/personas/{id}")
    public ResponseEntity<Persona> obtenerPersonaPorId(@PathVariable Long id){
        Persona persona = repository.findById(id).orElseThrow();
        return ResponseEntity.ok(persona);
    }

    @PutMapping("/personas/{id}")
    public ResponseEntity<Persona> actualizarPersona(@PathVariable Long id, @RequestBody Persona detallesPersona){
        Persona persona = repository.findById(id).orElseThrow();
        persona.setNombre(detallesPersona.getNombre());
        persona.setPrimer_apellido(detallesPersona.getPrimer_apellido());
        persona.setSegundo_apellido(detallesPersona.getSegundo_apellido());
        persona.setTelefono(detallesPersona.getTelefono());
        persona.setEstatus(detallesPersona.getEstatus());

        Persona personaActualizado = repository.save(persona);
        return ResponseEntity.ok(persona);
    }
}
