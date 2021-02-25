package com.kagboton.springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("rugbyCoach")
@Scope("prototype")
public class RugbyCoach implements Coach, DisposableBean {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    public RugbyCoach(){
        System.out.println(">> RugbyCoach :: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return ">> RugbyCoach :: practice your running";
    }

    //init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">> RugbyCoach :: inside init method");
    }

    // destroy method
    @Override
    public void destroy() throws Exception {
        System.out.println(">> RugbyCoach :: inside destroy method");
    }

    @Override
    public String getDailyFortune() {
        return ">> RugbyCoach :: " + fortuneService.getDailyFortune();
    }


}
