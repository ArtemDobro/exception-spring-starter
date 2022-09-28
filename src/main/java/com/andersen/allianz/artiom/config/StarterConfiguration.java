package com.andersen.allianz.artiom.config;

import com.andersen.allianz.artiom.service.ServiceException;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(StarterProperties.class)
public class StarterConfiguration {
    @Bean
    public ServiceException getService(StarterProperties props){
        return new ServiceException(props);
    }
}
