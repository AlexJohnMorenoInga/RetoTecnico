package com.alexmoreno.prueba_tecnica.infrastructure.rest.controller;

import com.alexmoreno.prueba_tecnica.application.service.ClientService;
import com.alexmoreno.prueba_tecnica.domain.model.Client;
import com.alexmoreno.prueba_tecnica.infrastructure.rest.dto.ClientDTO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clients")
@Slf4j
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @Operation(description = "Endpoint para crear clientes")
    @PostMapping
    public ResponseEntity<Client> saveClient(@RequestBody ClientDTO clientDTO){

        //Validar name ?
        //Validar email ?

        Client client = Client.builder()
                //.idClient()
                .name(clientDTO.getName())
                .email(clientDTO.getEmail())
                .build();

        Client clientSaved = clientService.saveClient(client);

        return new ResponseEntity<>(clientSaved, HttpStatus.CREATED);

    }

    @Operation(description = "Endpoint para mostrar un cliente por id")
    @GetMapping("/{idClient}")
    public ResponseEntity<Client> getClient(@PathVariable(value = "idClient") Long idClient){

        Client client = clientService.getClient(idClient);

        return new ResponseEntity<>(client, HttpStatus.OK);

    }

}
