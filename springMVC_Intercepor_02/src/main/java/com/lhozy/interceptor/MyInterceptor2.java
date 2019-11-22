package com.lhozy.interceptor;

import com.lhozy.domain.User;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class MyInterceptor2 implements HandlerInterceptor{
    /**
     * 预处理，controller方法执行前
     * return true 放行，执行下一个拦截器，如果没有，执行controller中的方法
     * return false不放行
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle执行了-----第二个拦截器");
        Boolean flag = true;
//        ModelAndView modelAndView = (ModelAndView) handler;
//        Map<String, Object> model = modelAndView.getModel();
//        User user = (User)model.get("user");
//        if(user.getPassword().length()<6){
//            flag = false;
//            request.setAttribute("errmsg","用户密码6位以上");
//            request.getRequestDispatcher("/WEB-INF/pages/errorpage").forward(request,response);
//        }

        return flag;
    }

    /**
     * 后处理方法，controller方法执行后，success.jsp执行之前
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle执行了-----第二个拦截器");
        Map<String, Object> model = modelAndView.getModel();
        User user = (User)model.get("user");
        System.out.println("postHandle:"+user);
    }

    /**
     * success.jsp页面执行后，该方法会执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion执行了-----第二个拦截器");
    }
}
