package com.alexmoreno.prueba_tecnica.infrastructure.rest.mapper;

import com.alexmoreno.prueba_tecnica.domain.model.Client;
import com.alexmoreno.prueba_tecnica.infrastructure.entity.ClientEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    @Mappings({
            @Mapping(source = "idClient", target = "idClient"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "email", target = "email")
    }
    )
    Client toClient(ClientEntity clientEntity);
    Iterable<Client> toClients(Iterable<ClientEntity> clientEntities);

    @InheritInverseConfiguration
    ClientEntity toClientEntity(Client client);

}
