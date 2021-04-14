package com.healthcheck.sanityservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SanityController {
    
    @GetMapping("checkSite")
    public String getSiteCurrentStatus(@RequestParam String url){
        System.out.println("url is "+url);
        return "Yes";
    }
}
