package com.alexmoreno.prueba_tecnica.application.service;

import com.alexmoreno.prueba_tecnica.domain.model.Persona;

public interface PersonaService {

    // Para guardar a una persona
    Persona savePersona(Persona persona);

    // Para listar a todas las personas
    Iterable<Persona> getAllPersonas();

}
