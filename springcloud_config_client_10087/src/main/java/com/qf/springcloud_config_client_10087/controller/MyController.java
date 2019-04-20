package com.qf.springcloud_config_client_10087.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Value("${com.name}")
    private String value;

    @RequestMapping("/config/test")
    @ResponseBody
    public String configTest(){
        return "通过远程配置中心获得配置：" + value;
    }
}
