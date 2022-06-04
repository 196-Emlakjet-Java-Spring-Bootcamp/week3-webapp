package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebAppController {

    @GetMapping("/")
    public String mainMenu(){
        return "webapp.html";
    }

    @GetMapping("/ui")
    public String ui(){

        return "";
    }
}
