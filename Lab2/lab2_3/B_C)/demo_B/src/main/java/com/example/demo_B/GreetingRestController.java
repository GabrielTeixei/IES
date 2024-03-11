package com.example.demo_B;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {
        return new Greeting(1, "Hello, " + name + "!");
    }
}

class Greeting {
    private int id;
    private String content;

    public Greeting(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
