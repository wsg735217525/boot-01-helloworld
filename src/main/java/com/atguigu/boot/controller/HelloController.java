package com.atguigu.boot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用@RestController可以代替
 * @ResponseBody
 * @Controller
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String handle01(){
        return "Hello,springboot";
    }
}
