package com.ccc.example.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:custom.properties", encoding = "UTF-8")
@ConfigurationProperties("local")
@Data
public class Local {
    private String key1;
    private String key2;
}
