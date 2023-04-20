package com.ecotechgroup.software.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldRestController {

    @GetMapping("/test-rest")
    public String sayHello(){
        return "Hello World Rest Controller Here";
    }
}
