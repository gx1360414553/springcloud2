package com.qf.springcloud_provider_9091.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
@RefreshScope
public class UserController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello/{param}")
    @ResponseBody
    public String hello(@PathVariable("param") String param){
        System.out.println("服务提供者被调用，参数为：" + param + ",提供者的端口为：" + port);
        return  "服务提供者:" + port;
    }
}
