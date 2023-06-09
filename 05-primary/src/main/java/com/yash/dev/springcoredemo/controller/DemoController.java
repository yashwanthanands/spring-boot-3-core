package com.yash.dev.springcoredemo.controller;


import com.yash.dev.springcoredemo.utils.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yashwanthanands
 */

@RestController
public class DemoController {

    com.yash.dev.springcoredemo.utils.Coach myCoach;

    @Autowired
    public DemoController(Coach theCoach) {
        myCoach= theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkOut(){
        return myCoach.getDailyWorkout();
    }
}
