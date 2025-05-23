package com.alexmoreno.prueba_tecnica.infrastructure.adapter;

import com.alexmoreno.prueba_tecnica.domain.model.Client;
import com.alexmoreno.prueba_tecnica.domain.port.ClientRepository;
import com.alexmoreno.prueba_tecnica.infrastructure.entity.ClientEntity;
import com.alexmoreno.prueba_tecnica.infrastructure.exceptions.ResourceNotFoundException;
import com.alexmoreno.prueba_tecnica.infrastructure.rest.mapper.ClientMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Slf4j
public class ClientAdapterRepository implements ClientRepository {

    private final ClientCrudRepository clientCrudRepository;

    private final ClientMapper clientMapper;

    public ClientAdapterRepository(ClientCrudRepository clientCrudRepository, ClientMapper clientMapper) {
        this.clientCrudRepository = clientCrudRepository;
        this.clientMapper = clientMapper;
    }

    @Override
    public Client saveClient(Client client) {
        var clientEntity = this.clientMapper.toClientEntity(client);
        var savedClientEntity = this.clientCrudRepository.save(clientEntity);
        return this.clientMapper.toClient(savedClientEntity);
    }

    @Override
    public Optional<Client> getClient(Long idClient) {
        ClientEntity clientEntity = this.clientCrudRepository.findById(idClient).orElseThrow(
                () -> new ResourceNotFoundException("Cliente no encontrado")
        );
        return Optional.of(this.clientMapper.toClient(clientEntity));
    }

}
