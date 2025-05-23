package com.alexmoreno.prueba_tecnica.domain.port;

import com.alexmoreno.prueba_tecnica.domain.model.Persona;

public interface PersonaRepository {

    // Para guardar a una persona
    Persona savePersona(Persona persona);

    // Para listar a todas las personas
    Iterable<Persona> getAllPersonas();

}
