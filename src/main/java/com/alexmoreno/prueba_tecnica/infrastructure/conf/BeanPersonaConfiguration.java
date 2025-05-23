package com.alexmoreno.prueba_tecnica.infrastructure.conf;

import com.alexmoreno.prueba_tecnica.application.service.DomainPersonaService;
import com.alexmoreno.prueba_tecnica.application.service.PersonaService;
import com.alexmoreno.prueba_tecnica.domain.port.PersonaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanPersonaConfiguration {

    @Bean
    PersonaService personaBeanService(final PersonaRepository personaRepository){
        return new DomainPersonaService(personaRepository);
    }

}
