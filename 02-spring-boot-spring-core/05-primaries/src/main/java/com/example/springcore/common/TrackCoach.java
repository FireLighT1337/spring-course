package com.example.springcore.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Primary is used to select a default implementation, in case there are multiple that could be used
@Component
@Primary
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

}
