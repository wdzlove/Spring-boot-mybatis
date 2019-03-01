package com.wdz.boot.helloboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
@Slf4j
public class HelloSpringBootController {

    @RequestMapping("get")
    public String get(String msg){
        log.info("接收到的参数是："+msg);
        System.out.println("接收到的参数是："+msg);
        return "return "+msg;
    }
}
