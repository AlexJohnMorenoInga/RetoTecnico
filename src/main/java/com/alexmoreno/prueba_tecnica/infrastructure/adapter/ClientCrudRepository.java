package com.alexmoreno.prueba_tecnica.infrastructure.adapter;

import com.alexmoreno.prueba_tecnica.infrastructure.entity.ClientEntity;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<ClientEntity, Long> {
}
