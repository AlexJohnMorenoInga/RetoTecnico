package com.alexmoreno.prueba_tecnica.infrastructure.adapter;

import com.alexmoreno.prueba_tecnica.domain.model.Persona;
import com.alexmoreno.prueba_tecnica.domain.port.PersonaRepository;
import com.alexmoreno.prueba_tecnica.infrastructure.rest.mapper.PersonaMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class PersonaAdapterRepository implements PersonaRepository {

    private final PersonaCrudRepository personaCrudRepository;

    private final PersonaMapper personaMapper;

    public PersonaAdapterRepository(PersonaCrudRepository personaCrudRepository, PersonaMapper personaMapper) {
        this.personaCrudRepository = personaCrudRepository;
        this.personaMapper = personaMapper;
    }

    @Override
    public Persona savePersona(Persona persona) {

        var personaEntity = this.personaMapper.toPersonaEntity(persona);
        var savedPersonaEntity = this.personaCrudRepository.save(personaEntity);
        return this.personaMapper.toPersona(savedPersonaEntity);

    }

    @Override
    public Iterable<Persona> getAllPersonas() {

        var personaEntities = this.personaCrudRepository.findAll();
        return this.personaMapper.toPersonas(personaEntities);

    }

}
