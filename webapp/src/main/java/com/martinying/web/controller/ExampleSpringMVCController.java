package com.martinying.web.controller;

import com.martinying.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExampleSpringMVCController {
    @Autowired
    private ExampleService service;

    @RequestMapping("/hello")
    public ModelAndView hello(Model model){
        return new ModelAndView("index.jsp", "testMessage", service.executeService().getAttribute());
    }
}
