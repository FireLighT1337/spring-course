package com.example.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// Primary is used to select a default implementation, in case there are multiple that could be used
// Lazy will only initialize a component when it is actually needed
@Component
@Lazy
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

}
