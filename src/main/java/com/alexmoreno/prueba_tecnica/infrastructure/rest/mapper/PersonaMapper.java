package com.alexmoreno.prueba_tecnica.infrastructure.rest.mapper;

import com.alexmoreno.prueba_tecnica.domain.model.Persona;
import com.alexmoreno.prueba_tecnica.infrastructure.entity.PersonaEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

    @Mappings({
            @Mapping(source = "idPersona", target = "idPersona"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "genero", target = "genero"),
            @Mapping(source = "ubicacion", target = "ubicacion"),
            @Mapping(source = "correo", target = "correo"),
            @Mapping(source = "fechaNacimiento", target = "fechaNacimiento"),
            @Mapping(source = "fotografia", target = "fotografia")
    }
    )
    Persona toPersona(PersonaEntity personaEntity);
    Iterable<Persona> toPersonas(Iterable<PersonaEntity> personaEntities);

    @InheritInverseConfiguration
    PersonaEntity toPersonaEntity(Persona persona);

}
