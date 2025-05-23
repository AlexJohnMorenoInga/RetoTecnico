package com.alexmoreno.prueba_tecnica.application.service;

import com.alexmoreno.prueba_tecnica.domain.model.Case;
import com.alexmoreno.prueba_tecnica.domain.port.CaseRepository;

public class DomainCaseService implements CaseService{

    private final CaseRepository caseRepository;

    public DomainCaseService(CaseRepository caseRepository) {
        this.caseRepository = caseRepository;
    }

    @Override
    public Case saveCase(Long idClient, Case casedom) {
        return this.caseRepository.saveCase(idClient, casedom);
    }

    @Override
    public Iterable<Case> getCasesByIdClient(Long idClient) {
        return this.caseRepository.getCasesByIdClient(idClient);
    }

}
