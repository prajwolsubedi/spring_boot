package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    // Inject properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello(){
        return "Hello Worldasdf!";
    }

    //expose a new endpoint for "works"
    @GetMapping("work")
    public String getWordDone(){
        return "Back in the Zone!!!! Gotta finish my tasks";
    }

    @GetMapping("enjoy")
    public String enjoyLife(){
        return "Don't forgot to smile and just enjoy life";
    }

    @GetMapping("team")
    public String getTeam(){
        return "Your team is " + teamName + " and your coach is " + coachName;
    }

}
