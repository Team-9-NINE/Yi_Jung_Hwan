package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Main_Controller {

    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "대충 안녕하다는말~";
    }
}
