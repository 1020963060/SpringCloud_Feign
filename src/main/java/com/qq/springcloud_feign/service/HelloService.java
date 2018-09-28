package com.qq.springcloud_feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "provider1803")//配置提供者的名称
public interface HelloService {
    @RequestMapping(value = "hello.do",method =RequestMethod.GET )
    String hi();
}
