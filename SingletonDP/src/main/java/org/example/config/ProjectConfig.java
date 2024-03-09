package org.example.config;

import org.example.controllers.DemoController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.controllers")
public class ProjectConfig {
    @Bean
    public DemoController demoController1(){
        return new DemoController();
    }
}
