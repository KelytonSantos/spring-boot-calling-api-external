package com.example.springbootcallingexternalapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.springbootcallingexternalapi.service.AdviceSlipService;


@RestController
public class RestSpringBootController {
    
    @Autowired
    public AdviceSlipService adviceSlipService;

    @RequestMapping("/hello")
    public String requestMethodName() {
        return "Hello Java";
    }

    @GetMapping(value = "/callclienthello")
    private String getHello(){
        
        String uri = "http://localhost:8080/hello";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri,String.class);
        return result;
    }

    @GetMapping(value = "/api/adviceslip")
    private String getApi(){
        
        String uri = "https://api.adviceslip.com/advice";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri,String.class);
        return result;
    }
}