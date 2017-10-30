package com.zhulg.springboot.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhulianggang on 2017/10/30.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    public String helloSpringBoot(){
        return "Hello SpringBoot with jenkins test!";
    }
}
