package com.test.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController:spring mvc的注解，
 * 相当于@Controller与@ResponseBody的合体，可以直接返回json
 *
 * @EnableAutoConfiguration:spring boot的注解
 * 是无配置启动的关键部分
 */
@RestController
@EnableAutoConfiguration
public class TestBoot {
    
    @RequestMapping("/hello")
    public String testFirstMethod(){
        return "Hello jiahao!!!";
    }
    
    /**
     * spring boot的入口，在整个项目中，包括其子项目在内，
     * 只能有一个main方法，否则spring boot启动不起来
     */
    public static void main(String[] args) {
        SpringApplication.run(TestBoot.class, args);
    }
    
}