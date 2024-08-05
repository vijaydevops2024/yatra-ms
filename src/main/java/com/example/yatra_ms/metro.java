package com.example.yatra_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class metro {

    @GetMapping("/metro")
    public String getData() {
        return  "Please book your metro ticket from yatra app on 49% discount" ;
    }
}