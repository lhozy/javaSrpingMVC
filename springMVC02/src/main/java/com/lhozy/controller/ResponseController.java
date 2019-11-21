package com.lhozy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/resp")
@Controller
public class ResponseController {
    @RequestMapping("/testString")
    public String testString(){
        System.out.println("testString 执行了");
        return "success";
    }
}
