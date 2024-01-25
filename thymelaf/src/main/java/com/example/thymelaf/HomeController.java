package com.example.thymelaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {


    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World!");
        return "hello";
    }
    @PostMapping("/hello")
    public String helloPost(Model model) {
        model.addAttribute("message", "We are in the POST method!");
        return "hello";
    }




}