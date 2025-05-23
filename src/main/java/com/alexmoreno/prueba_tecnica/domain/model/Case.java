package com.alexmoreno.prueba_tecnica.domain.model;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Case {

    private Long idCase;

    private String title;

    private String description;

    private LocalDate createdAt;

    private StatusCaseDom status;

    private Client client;

}
