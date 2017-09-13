package com.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

/**
 * Created by alex
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHello() {

        return ("index");
    }
}
