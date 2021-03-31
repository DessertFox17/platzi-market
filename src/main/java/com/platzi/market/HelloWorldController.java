package com.platzi.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/H")
public class HelloWorldelloController {

    @GetMapping("/hi")
    public String Hello() {
        return "Nunca pares de aprender!";

    }
}
