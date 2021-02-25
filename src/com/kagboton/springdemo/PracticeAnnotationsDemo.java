package com.kagboton.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationsDemo {

    public static void main (String args[]){

        // load configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach practiceCoach = context.getBean("practiceCoach", Coach.class);

        // call methods
        System.out.println(practiceCoach.getDailyWorkout());

        System.out.println(practiceCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
