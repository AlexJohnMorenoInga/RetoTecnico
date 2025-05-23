package com.alexmoreno.prueba_tecnica.application.service;

import com.alexmoreno.prueba_tecnica.domain.model.Persona;
import com.alexmoreno.prueba_tecnica.domain.port.PersonaRepository;

public class DomainPersonaService implements PersonaService{

    private final PersonaRepository personaRepository;

    public DomainPersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public Persona savePersona(Persona persona) {
        return this.personaRepository.savePersona(persona);
    }

    @Override
    public Iterable<Persona> getAllPersonas() {
        return this.personaRepository.getAllPersonas();
    }
}
