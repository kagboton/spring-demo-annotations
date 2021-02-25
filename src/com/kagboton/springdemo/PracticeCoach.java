package com.kagboton.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PracticeCoach implements Coach {

    @Autowired
    @Qualifier("randomFromFileFortuneService")
    FortuneService fortuneService;

    public PracticeCoach() {
        System.out.println(">> PracticeCoach :: inside the default constructor");
    }

    // define my init method
    @PostConstruct
    public void doMyStatupStuff(){
        System.out.println(">> PracticeCoach :: inside init method");
    }

    //define my destroy methode
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">> PracticeCoach :: inside destroy method");
    }

    @Override
    public String getDailyWorkout() {
        return "My Practice coach daily workout";
    }

    @Override
    public String getDailyFortune() {
        return "Practice coach " + fortuneService.getDailyFortune();
    }
}
