package com.kagboton.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

    public static void main (String args[]){

        // load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach rugbyCoach = context.getBean("rugbyCoach", Coach.class);

        // call a method on the bean
        System.out.println(rugbyCoach.getDailyWorkout());
        System.out.println(rugbyCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
