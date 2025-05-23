package com.alexmoreno.prueba_tecnica.domain.model;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    private Long idClient;

    private String name;

    private String email;

}
