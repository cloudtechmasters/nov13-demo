package com.hcl.nov13demoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
@SpringBootApplication
@RestController
public class Nov13DemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Nov13DemoProjectApplication.class, args);
	}
//
    @GetMapping("/hello")
    public String helloapi(){
                return "hello";
    }
}
