package com.alexmoreno.prueba_tecnica.infrastructure.adapter;

import com.alexmoreno.prueba_tecnica.infrastructure.entity.PersonaEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonaCrudRepository extends CrudRepository<PersonaEntity, Long> {
}
