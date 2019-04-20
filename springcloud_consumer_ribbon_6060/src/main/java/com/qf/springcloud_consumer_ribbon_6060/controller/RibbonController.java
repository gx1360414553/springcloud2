package com.qf.springcloud_consumer_ribbon_6060.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

//    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping("/hello")
    public String ribbon(){
        System.out.println("调用了服务的消费者！");
        String result = restTemplate.getForObject("http://USER-PROVIDER/user/hello/abc", String.class);
        return result;
    }

    public String fallback(){
        return "目标服务器出现问题，熔断器已经打开";
    }
}
