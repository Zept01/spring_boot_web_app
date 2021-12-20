package com.springboot.web.springbootwebapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// /login -> "Hello World!"
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    @ResponseBody
    public String loginMessage() {
        return "Hello World!";
    }


}
