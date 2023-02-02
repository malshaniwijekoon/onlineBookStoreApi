package com.example.controller;

import com.example.dto.User;
import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public String login(@RequestBody User user){
        return loginService.login(user);
    }
}
