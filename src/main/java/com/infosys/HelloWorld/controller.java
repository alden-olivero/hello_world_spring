package com.infosys.HelloWorld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("/")
    public String sayNamaste() {
        return "Namaste";
    }
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, world";
    }
}