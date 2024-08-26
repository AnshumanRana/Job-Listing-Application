package com.JobListing.joblisting.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthcheck {
    @GetMapping("/health-check")
    public String heathCheck(){
        return "All good to go";
    }
}
