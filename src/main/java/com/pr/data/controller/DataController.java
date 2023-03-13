package com.pr.data.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/page")
public class DataController {

    @GetMapping("/hello")
    public @ResponseBody String hello(HttpServletRequest req) {
        System.out.println("hello");
        return "hello";
    }
}
