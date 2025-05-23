package com.alexmoreno.prueba_tecnica.application.service;

import com.alexmoreno.prueba_tecnica.domain.model.Client;
import com.alexmoreno.prueba_tecnica.domain.port.ClientRepository;

public class DomainClientService implements ClientService{

    private final ClientRepository clientRepository;

    public DomainClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client saveClient(Client client) {
        return this.clientRepository.saveClient(client);
    }

    @Override
    public Client getClient(Long idClient) {
        return this.clientRepository.getClient(idClient).get();
    }

}
