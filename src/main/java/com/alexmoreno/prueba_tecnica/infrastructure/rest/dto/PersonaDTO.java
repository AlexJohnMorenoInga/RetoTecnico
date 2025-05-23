package com.alexmoreno.prueba_tecnica.infrastructure.rest.dto;

import com.alexmoreno.prueba_tecnica.domain.model.GeneroDom;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonaDTO {

    private String nombre;

    private GeneroDom genero;

    private String ubicacion;

    private String correo;

    private LocalDate fechaNacimiento;

    private String fotografia;

}
