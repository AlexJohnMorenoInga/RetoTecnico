package com.alexmoreno.prueba_tecnica.infrastructure.conf;

import com.alexmoreno.prueba_tecnica.application.service.ClientService;
import com.alexmoreno.prueba_tecnica.application.service.DomainClientService;
import com.alexmoreno.prueba_tecnica.domain.port.ClientRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanClientConfiguration {

    @Bean
    ClientService clientBeanService(final ClientRepository clientRepository){
        return new DomainClientService(clientRepository);
    }

}
