package com.springboot.web.springbootwebapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class testController {


    @RequestMapping("/test")
    public String test(@RequestParam String test, ModelMap model) {
        model.put("test", test);
        return "test";
    }


}
