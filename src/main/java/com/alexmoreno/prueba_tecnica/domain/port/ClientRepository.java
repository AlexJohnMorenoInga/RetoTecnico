package com.alexmoreno.prueba_tecnica.domain.port;

import com.alexmoreno.prueba_tecnica.domain.model.Client;

import java.util.Optional;

public interface ClientRepository {

    // Para guardar un cliente
    Client saveClient(Client client);

    // Para traer un cliente por su id
    Optional<Client> getClient(Long idClient);

}
