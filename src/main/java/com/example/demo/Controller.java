package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//@RestController
public class Controller {
    @Value("${age}")
    private  String age;
    @Value("${name}")
    private  String name;
    @RequestMapping("/test")
    public  String  test(){
         return  "年龄："+age+ "姓名："+name;
    }
}
