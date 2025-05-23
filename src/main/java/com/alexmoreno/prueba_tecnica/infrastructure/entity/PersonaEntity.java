package com.alexmoreno.prueba_tecnica.infrastructure.entity;

import com.alexmoreno.prueba_tecnica.domain.model.GeneroDom;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persona")
public class PersonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_persona")
    private Long idPersona;

    private String nombre;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    private String ubicacion;

    @Column(unique = true)
    private String correo;

    @Column(name="fecha_nacimiento")
    private LocalDate fechaNacimiento;

    private String fotografia;

}
