package com.lhozy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class HelloController {
    @RequestMapping(path = "/hello",method = RequestMethod.GET)
    public String hello(){
        System.out.println("hello");
        return "success";
    }
}
