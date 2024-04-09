package com.example.demo.rest;

import com.example.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //Define a private field for dependency
    private Coach myCoach;

    /*
    //Constructer injection
    @Autowired
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }
     */


    //Setter injection
    @Autowired
    public void setCoach(@Qualifier("cricketCoach") Coach theCoach){
        System.out.println("In Constructor " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
