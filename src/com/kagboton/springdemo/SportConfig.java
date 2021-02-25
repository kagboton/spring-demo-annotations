package com.kagboton.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.kagboton.springdemo")
public class SportConfig {

    // define bean for the sadFortuneService
    @Bean
    public SadFortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    // define bean for the swimCoach with sadFortuneService dependency
    @Bean
    public SwimCoach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}
