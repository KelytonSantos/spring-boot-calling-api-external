package com.example.springbootcallingexternalapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class RestSpringBootController {
    
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

    @GetMapping(value = "/api/adviceslip/{}")
    private String getApiEsp(@PathVariable String text){
        
        String uri = "https://api.adviceslip.com/advice/search/"+ text;
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri,String.class);
        return result;
    }
}