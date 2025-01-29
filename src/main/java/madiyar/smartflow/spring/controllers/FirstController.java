package madiyar.smartflow.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class FirstController {

    @GetMapping("/hello")
    public String helloPage(){
        return "first/hello.html";
    }
    @GetMapping("/goodbye")
    public String goodByePage(){
        return "first/goodbye.html";
    }
}
