package com.alexmoreno.prueba_tecnica.infrastructure.adapter;

import com.alexmoreno.prueba_tecnica.infrastructure.entity.CaseEntity;
import org.springframework.data.repository.CrudRepository;

public interface CaseCrudRepository extends CrudRepository<CaseEntity, Long> {

    Iterable<CaseEntity> findByClientIdClient(Long idClient);

}
