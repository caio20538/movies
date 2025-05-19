package dev.caio.filmes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @GetMapping
    public String apiIndex(){
        return "Hello World";
    }
}
