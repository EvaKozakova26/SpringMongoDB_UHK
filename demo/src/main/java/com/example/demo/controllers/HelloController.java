package com.example.demo.controllers;

import com.example.demo.ToDo;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
@CrossOrigin("*")  // mohu se připojit  jinych portůl
public class HelloController {

    @GetMapping("/eva")
    public String doHello() {
        return "Hello world";
    }

}
