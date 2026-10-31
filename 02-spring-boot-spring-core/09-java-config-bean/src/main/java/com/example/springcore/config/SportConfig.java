package com.example.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springcore.common.Coach;
import com.example.springcore.common.SwimCoach;

// when working with 3rd party code, a config annotation might be required since we cant use the @Component annotation on it
@Configuration
public class SportConfig {
    // inside the config class we can define this bean
    // to make spring detect this code
    // we can also give the bean a custom name through a parameter like this:
    // @Bean("aquatic")
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
