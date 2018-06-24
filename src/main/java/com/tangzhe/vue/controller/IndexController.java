package com.tangzhe.vue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 唐哲
 * 2018-06-24 17:04
 */
@Controller
public class IndexController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
