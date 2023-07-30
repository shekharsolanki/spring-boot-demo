package com.dailycodebuffer.springbootdemo.controller;

import com.dailycodebuffer.springbootdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello World !";
    }

//    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setId("1");
        user.setName("Shekhar");
        user.setEmailId("shekhar.solanki@gmail.com");

        return user;
    }
}