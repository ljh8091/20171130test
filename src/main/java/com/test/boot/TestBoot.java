package com.test.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController:spring mvc��ע�⣬
 * �൱��@Controller��@ResponseBody�ĺ��壬����ֱ�ӷ���json
 *
 * @EnableAutoConfiguration:spring boot��ע��
 * �������������Ĺؼ�����
 */
@RestController
@EnableAutoConfiguration
public class TestBoot {
    
    @RequestMapping("/hello")
    public String testFirstMethod(){
        return "Hello jiahao!!!";
    }
    
    /**
     * spring boot����ڣ���������Ŀ�У�����������Ŀ���ڣ�
     * ֻ����һ��main����������spring boot����������
     */
    public static void main(String[] args) {
        SpringApplication.run(TestBoot.class, args);
    }
    
}