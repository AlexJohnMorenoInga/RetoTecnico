package com.alexmoreno.prueba_tecnica.infrastructure.rest.dto;

import com.alexmoreno.prueba_tecnica.domain.model.Client;
import com.alexmoreno.prueba_tecnica.domain.model.StatusCaseDom;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CaseDTO {

    private String title;

    private String description;

    //private StatusCaseDom status;
}
