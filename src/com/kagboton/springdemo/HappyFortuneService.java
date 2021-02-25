package com.kagboton.springdemo;

import org.springframework.stereotype.Component;


@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getDailyFortune() {
        return "Here is my happy forture service message";
    }
}
