package com.platzi.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloWorldController {

    @GetMapping("/hi")
    public String Hello() {
        return "Nunca pares de aprender!";

    }
}
