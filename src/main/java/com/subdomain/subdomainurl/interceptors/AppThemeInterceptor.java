package com.subdomain.subdomainurl.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AppThemeInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("Welcome to my interceptor!!!!");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        String address = request.getServerName();
        String[] teps = address.split("[.]");
        String organizationName = teps[0];
        System.out.println(organizationName + " Local Name: " + request.getLocalName());
        if(organizationName.contains("iit")) {
            modelAndView.addObject("themeColor", "red");
        } else {
            modelAndView.addObject("themeColor", "blue");
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
