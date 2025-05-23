package com.alexmoreno.prueba_tecnica.domain.model;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    private Long idPersona;

    private String nombre;

    private GeneroDom genero;

    private String ubicacion;

    private String correo;

    private LocalDate fechaNacimiento;

    private String fotografia;

}
