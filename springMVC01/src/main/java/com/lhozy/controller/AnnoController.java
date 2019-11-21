package com.lhozy.controller;

import com.lhozy.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/anno")
@SessionAttributes(value={"msg"})
public class AnnoController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam("name") String accountName){//请求时参数名不一致时，使用@RequestParam来映射
        System.out.println(accountName);
        return "success";
    }
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){//@RequestBody 把表单以username=aa&age=22形式赋值给方法的参数body
        System.out.println(body);
        return "success";
    }
    @RequestMapping("/testPathVariable/{sid}")  //sid
    public String testPathVariable(@PathVariable("sid") String id){//@PathVariable获取restful风格的参数10 anno/testPathVariable/10
        System.out.println(id);
        return "success";
    }
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader("Accept") String head, HttpServletResponse response){
        Cookie cookie = new Cookie("name","lis");
        response.addCookie(cookie);
        System.out.println(head);
        return "success";
    }
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("name") String cook){//@CookieValue根据key获取值封装到方法参数
        System.out.println(cook);
        return "success";
    }

//    @RequestMapping("/testModelAttribute")
//    public String testModelAttribute(User user){
//        System.out.println("注解在方法参数上，后执行");
//        System.out.println(user);
//        return "success";
//    }
//    @ModelAttribute
//    public User getUser(String uname){
//        //模拟根据用户名查找到用户
//        User user = new User();
//        user.setUname("hh");
//        user.setAge(20);
//        user.setId(1);
//        System.out.println("注解在方法体上1,先执行:"+user);
//        return user;
//    }

    /*@RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute User user){
        System.out.println("注解在方法参数上，后执行");
        System.out.println(user);
        return "success";
    }
    @ModelAttribute
    public User getUser(String uname){
        //模拟根据用户名查找到用户
        User user1 = new User();
        user1.setUname(uname);
        user1.setAge(20);
        user1.setId(1);
        System.out.println("注解在方法体上1,先执行");
        return user1;
    }
    @ModelAttribute
    public User getUser2(String uname){
        //模拟根据用户名查找到用户
        User user1 = new User();
        user1.setUname(uname);
        user1.setAge(30);
        user1.setId(2);
        System.out.println("注解在方法体上2,先执行");
        return user1;
    }*/
/*    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("one") User user){
        System.out.println("注解在方法参数上，后执行");
        System.out.println(user);
        return "success";
    }
    @ModelAttribute
    public void getUserMap(Map<String,User> map,String name){
        User user = new User();
        user.setUname(name);
        user.setAge(20);
        user.setId(1);

        User user2 = new User();
        user2.setUname("gg");
        user2.setAge(30);
        user2.setId(2);
        map.put("one",user);
        map.put("two",user2);
        System.out.println(map.size());
        System.out.println(map);
    }*/
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        model.addAttribute("msg","hello");//@SessionAttributes(value={"msg"})在类上把msg加入session域

        return "success";
    }
    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap model){
        System.out.println("get model");
        String msg = (String) model.get("msg");
        System.out.println(msg);
        return "success";
    }
    @RequestMapping("/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status){
        status.setComplete();//删除session

        return "success";
    }

}
