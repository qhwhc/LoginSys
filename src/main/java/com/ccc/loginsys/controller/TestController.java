package com.ccc.loginsys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("helloCloud")
    public String hello() {
        return "hello";
    }

}
