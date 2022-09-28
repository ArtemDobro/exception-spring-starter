package com.andersen.allianz.artiom.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "starter-exception")
public class StarterProperties {
    private String description;
}
