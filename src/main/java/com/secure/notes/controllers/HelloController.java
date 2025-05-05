package com.secure.notes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/sup")
    public String saySup() {
        return "sup";
    }

    @GetMapping("/contact")
    public String contact() {
        return "hey";
    }

}
