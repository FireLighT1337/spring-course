package com.example.springcore.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// Scope can change the way beans are created
// in this case there is a new object instance for each injection
@Scope("prototype")
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

}
