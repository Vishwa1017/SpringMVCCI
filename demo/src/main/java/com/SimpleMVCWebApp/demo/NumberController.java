package com.SimpleMVCWebApp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {


    @GetMapping("/double")
    public double doubleNumber(@RequestParam(name="number" , defaultValue = "0") double number ) {
        return 2*number;
    }
}
