package com.lhozy.controller;

import com.lhozy.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RequestMapping("/user")
@Controller
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model){
        User user = new User();
        user.setUserName("lisi");
        user.setPassword("123");
        user.setAge(30);
        model.addAttribute("user",user);
        return "success";
    }
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {//没有返回值，默认访问映射的路径/mvc02/WEB-INF/pages/user/testVoid.jsp
        System.out.println("testVoid------------");
        request.setAttribute("msg","forward");
        //转发
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //重定向
//        response.sendRedirect(request.getContextPath()+"/redirect.jsp");
        //直接输出
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print("你好");

    }
    @RequestMapping("/testForwardAndRedirect")
    public String testForwardAndRedirect(){
        System.out.println("testForwardAndRedirect------------");
//        return "forward:/WEB-INF/pages/success.jsp";
        return "redirect:/redirect.jsp";
    }
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        System.out.println("testModelAndView--------");
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setUserName("leo");
        user.setPassword("123123");
        user.setAge(20);
        modelAndView.addObject("user",user);
        modelAndView.setViewName("success");//转发的页面
        return modelAndView;
    }
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("testAjax----------");
        System.out.println(user);
        user.setUserName("zhaoliu");
        user.setAge(18);
        return user;
    }
}
