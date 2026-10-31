package com.example.springcore.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcore.common.Coach;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {
    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor for dependency injection
    // Autowired is optional when there is only 1 constructor
    // Qualifier is used to specify which Coach implementation should be used
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    // setter injection
    /*
     * @Autowired
     * public void setCoach(Coach theCoach) {
     * myCoach = theCoach;
     * }
     */

    @GetMapping("dailyworkout")
    public String getDailyWorkouT() {
        return myCoach.getDailyWorkout();
    }

}
