package com.example.jvm.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class indexController {

    @GetMapping("")
    public String index(){
        return "havlo jvm workshop!!";
    }

}
