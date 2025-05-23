package com.alexmoreno.prueba_tecnica.application.service;

import com.alexmoreno.prueba_tecnica.domain.model.Case;

public interface CaseService {

    // Crear caso
    Case saveCase(Long idClient, Case casedom);

    // Mostrar los casos por id cliente
    Iterable<Case> getCasesByIdClient(Long idClient);

}
