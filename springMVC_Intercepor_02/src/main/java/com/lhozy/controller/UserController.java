package com.lhozy.controller;

import com.lhozy.domain.User;
import com.lhozy.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testException")
    public String testException() throws Exception {
        System.out.println("testException............异常");
        try {
            int i = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("攻城狮正在抢救");
        }
        return "success";

    }
    @RequestMapping("/testUser")
    public String testUser(){
        System.out.println("testUser............");
        return "success";

    }
    @RequestMapping("/testUser2")
    public String testUserSave(){
        System.out.println("testUserSave............222");
        return "success";

    }
    @RequestMapping("/logon")
    public ModelAndView logon(User user){
        System.out.println("用户注册............");
        System.out.println(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("success");
        return modelAndView;

    }

    @RequestMapping("/login")
    public ModelAndView login(User user){
        System.out.println("用户登录............");
        System.out.println(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("success");
        return modelAndView;

    }
}
