package com.alexmoreno.prueba_tecnica.infrastructure.adapter;

import com.alexmoreno.prueba_tecnica.domain.model.Case;
import com.alexmoreno.prueba_tecnica.domain.port.CaseRepository;
import com.alexmoreno.prueba_tecnica.infrastructure.entity.CaseEntity;
import com.alexmoreno.prueba_tecnica.infrastructure.entity.ClientEntity;
import com.alexmoreno.prueba_tecnica.infrastructure.exceptions.ResourceNotFoundException;
import com.alexmoreno.prueba_tecnica.infrastructure.rest.mapper.CaseMapper;
import com.alexmoreno.prueba_tecnica.infrastructure.rest.mapper.ClientMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class CaseAdapterRepository implements CaseRepository {

    private final CaseCrudRepository caseCrudRepository;

    private final ClientCrudRepository clientCrudRepository;

    private final CaseMapper caseMapper;

    private final ClientMapper clientMapper;

    public CaseAdapterRepository(CaseCrudRepository caseCrudRepository, ClientCrudRepository clientCrudRepository, CaseMapper caseMapper, ClientMapper clientMapper) {
        this.caseCrudRepository = caseCrudRepository;
        this.clientCrudRepository = clientCrudRepository;
        this.caseMapper = caseMapper;
        this.clientMapper = clientMapper;
    }

    @Override
    public Case saveCase(Long idClient, Case casedom) {

        ClientEntity clientEntity = clientCrudRepository.findById(idClient).orElseThrow(
                () -> new ResourceNotFoundException("Cliente no encontrado")
        );

        casedom.setClient(clientMapper.toClient(clientEntity));

        CaseEntity caseEntitySaved = caseCrudRepository.save(caseMapper.toCaseEntity(casedom));

        return caseMapper.toCase(caseEntitySaved);

    }

    @Override
    public Iterable<Case> getCasesByIdClient(Long idClient) {

        ClientEntity clientEntity = this.clientCrudRepository.findById(idClient).orElseThrow(
                () -> new ResourceNotFoundException("El id del cliente indicado no existe")
        );

        var caseEntities = this.caseCrudRepository.findByClientIdClient(clientEntity.getIdClient());

        return this.caseMapper.toCases(caseEntities);

    }
}
