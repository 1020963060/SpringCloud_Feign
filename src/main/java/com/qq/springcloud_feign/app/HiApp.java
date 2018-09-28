package com.qq.springcloud_feign.app;

import com.qq.springcloud_feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiApp {
    @Autowired
    private HelloService helloService;
    @RequestMapping("/hello.do")
    public String hi(){
        return helloService.hi();
    }
}
