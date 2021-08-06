package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class MyController {
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","处理了some.do的请求");
        mv.addObject("fun","于"+new Date()+"执行了doSome方法");
        mv.setViewName("/show.jsp");
        return mv;
    }
}
