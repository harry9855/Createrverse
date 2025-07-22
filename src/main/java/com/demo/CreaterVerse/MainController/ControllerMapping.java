package com.demo.CreaterVerse.MainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerMapping {

    @GetMapping("/")
    public String Navbar(){
        return "Navbar";
    }
    @GetMapping("/Signup")
    public String Signup(){
        return "Signup";
    }
    @GetMapping("/Signin")
    public String Signin(){
        return "Signin";
    }

}
