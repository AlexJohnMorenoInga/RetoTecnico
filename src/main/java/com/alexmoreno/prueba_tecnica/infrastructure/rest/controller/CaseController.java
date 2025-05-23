package com.alexmoreno.prueba_tecnica.infrastructure.rest.controller;

import com.alexmoreno.prueba_tecnica.application.service.CaseService;
import com.alexmoreno.prueba_tecnica.application.service.ClientService;
import com.alexmoreno.prueba_tecnica.domain.model.Case;
import com.alexmoreno.prueba_tecnica.domain.model.StatusCaseDom;
import com.alexmoreno.prueba_tecnica.infrastructure.rest.dto.CaseDTO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/cases")
@Slf4j
public class CaseController {

    private final CaseService caseService;

    public CaseController(CaseService caseService) {
        this.caseService = caseService;
    }

    @Operation(description = "Endpoint para crear casos")
    @PostMapping("/client/{idClient}")
    public ResponseEntity<Case> saveCase(@PathVariable(value = "idClient") Long idClient, @RequestBody CaseDTO caseDTO){

        Case casedomtwo = Case.builder()
                .title(caseDTO.getTitle())
                .description(caseDTO.getDescription())
                .createdAt(LocalDate.now())
                .status(StatusCaseDom.OPEN)
                .build();

        Case casesaved = caseService.saveCase(idClient, casedomtwo);

        return new ResponseEntity<>(casesaved, HttpStatus.CREATED);

    }


}
