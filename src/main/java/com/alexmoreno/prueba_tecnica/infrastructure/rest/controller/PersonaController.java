package com.alexmoreno.prueba_tecnica.infrastructure.rest.controller;

import com.alexmoreno.prueba_tecnica.application.service.PersonaService;
import com.alexmoreno.prueba_tecnica.domain.model.Persona;
import com.alexmoreno.prueba_tecnica.infrastructure.rest.dto.PersonaDTO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/api/personas")
@Slf4j
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @Operation(description = "Endpoint para crear personas")
    @PostMapping
    public ResponseEntity<Persona> savePersona(@RequestBody PersonaDTO personaDTO){

        Persona persona = Persona.builder()
                .nombre(personaDTO.getNombre())
                .genero(personaDTO.getGenero())
                .ubicacion(personaDTO.getUbicacion())
                .correo(personaDTO.getCorreo())
                .fechaNacimiento(personaDTO.getFechaNacimiento())
                .fotografia(personaDTO.getFotografia())
                .build();

        Persona personaSaved = personaService.savePersona(persona);

        return new ResponseEntity<>(personaSaved, HttpStatus.CREATED);

    }

    @Operation(description = "Endpoint para traer a todas las personas")
    @GetMapping
    public ResponseEntity<List<Persona>> getAllPersonas(){

        Iterable<Persona> personas = this.personaService.getAllPersonas();

        List<Persona> personaList = StreamSupport.stream(personas.spliterator(), false).collect(Collectors.toList());

        return new ResponseEntity<>(personaList, HttpStatus.OK);

    }
}
