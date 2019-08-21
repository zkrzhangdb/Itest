package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
    @Value("${application.name}")
    private  String name;
    @RequestMapping("/test")
    public  String  test(){
         return "test";
    }
}
