package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @RequestMapping("/hello")
    public ModelAndView Hello(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("hello");
        mav.addObject("hello",123);
        return mav;
    }
}
