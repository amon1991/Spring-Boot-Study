package com.amon.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * yaming.chen@siemens.com
 * Created by chenyaming on 2016/9/25.
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home(){
        return "Hello World";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Example.class,args);
    }

}
