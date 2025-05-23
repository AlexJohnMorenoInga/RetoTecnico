package com.alexmoreno.prueba_tecnica.infrastructure.rest.mapper;

import com.alexmoreno.prueba_tecnica.domain.model.Case;
import com.alexmoreno.prueba_tecnica.infrastructure.entity.CaseEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CaseMapper {

    @Mappings({
            @Mapping(source = "idCase", target = "idCase"),
            @Mapping(source = "title", target = "title"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "createdAt", target = "createdAt"),
            @Mapping(source = "status", target = "status"),
            @Mapping(source = "client", target = "client")
    }
    )
    Case toCase(CaseEntity caseEntity);
    Iterable<Case> toCases(Iterable<CaseEntity> caseEntities);

    @InheritInverseConfiguration
    CaseEntity toCaseEntity(Case casedom);

}
