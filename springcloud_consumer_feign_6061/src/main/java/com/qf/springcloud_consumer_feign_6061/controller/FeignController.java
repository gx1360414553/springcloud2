package com.qf.springcloud_consumer_feign_6061.controller;

import com.qf.springcloud_consumer_feign_6061.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/hello")
    public String ribbon(){
        System.out.println("调用了服务的消费者！");
        String result = iUserService.hello("参数");
        return result;
    }
}
