package com.example.yatra_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holiday {

    @GetMapping("/holiday")
    public String getData() {
        return  "Please book your holiday ticket from yatra app on 50% discount" ;
    }
}