package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FallbackController {

    @GetMapping("/employeefallback")
    public String employeeFallback(){
        return "Employee Service is down please Wait!!!!!";
    }

    @GetMapping("/departmentfallback")
    public String departmentFallback(){
        return "Department Service is down please Wait!!!!!";
    }
}
