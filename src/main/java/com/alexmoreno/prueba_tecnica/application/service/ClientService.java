package com.alexmoreno.prueba_tecnica.application.service;

import com.alexmoreno.prueba_tecnica.domain.model.Client;

import java.util.Optional;

public interface ClientService {

    // Para guardar un cliente
    Client saveClient(Client client);

    // Para traer un cliente por su id
    Client getClient(Long idClient);

}
