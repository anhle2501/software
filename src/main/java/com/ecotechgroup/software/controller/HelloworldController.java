package com.ecotechgroup.software.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloworldController {
    @GetMapping("/test")
    public String sayHello() {
        return "hello-world";
    }

}
