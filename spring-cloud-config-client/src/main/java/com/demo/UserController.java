package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${user.name}")
    private String name;

    @GetMapping("/info")
    public String info(){
        return name;
    }
}
