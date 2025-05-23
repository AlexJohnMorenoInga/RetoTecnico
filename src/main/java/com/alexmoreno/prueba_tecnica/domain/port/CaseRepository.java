package com.alexmoreno.prueba_tecnica.domain.port;

import com.alexmoreno.prueba_tecnica.domain.model.Case;

public interface CaseRepository {

    // Crear caso
    Case saveCase(Long idClient, Case casedom);

    // Mostrar los casos por id cliente
    Iterable<Case> getCasesByIdClient(Long idClient);

}
