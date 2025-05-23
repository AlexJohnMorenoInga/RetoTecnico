package com.alexmoreno.prueba_tecnica.infrastructure.rest.dto;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {

    private String name;

    private String email;

}
