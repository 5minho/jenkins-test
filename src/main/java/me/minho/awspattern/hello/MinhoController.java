package me.minho.awspattern.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MinhoController {

    @GetMapping("/min")
    public String hello() {
        return "ho";
    }
}
