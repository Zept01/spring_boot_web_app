package com.springboot.web.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

    public boolean validateUser(String name, String password) {
        //Pascal 123
        return name.equalsIgnoreCase("Pascal") && password.equals("123");
    }

}

