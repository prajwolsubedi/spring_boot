package com.example.demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    //After the bean has been initialized
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff() " + getClass().getSimpleName());
    }

    //When bean is removed from the Spring container
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff() " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice batting for 1 hour!";
    }
}
