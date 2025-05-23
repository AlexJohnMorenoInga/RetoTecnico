package com.alexmoreno.prueba_tecnica.infrastructure.conf;

import com.alexmoreno.prueba_tecnica.application.service.CaseService;
import com.alexmoreno.prueba_tecnica.application.service.DomainCaseService;
import com.alexmoreno.prueba_tecnica.domain.port.CaseRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCaseConfiguration {

    @Bean
    CaseService caseBeanService(final CaseRepository caseRepository){
        return new DomainCaseService(caseRepository);
    }

}
