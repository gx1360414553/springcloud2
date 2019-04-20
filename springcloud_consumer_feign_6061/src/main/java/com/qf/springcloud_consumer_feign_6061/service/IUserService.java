package com.qf.springcloud_consumer_feign_6061.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient(value = "USER-PROVIDER",fallback = UserServiceHystrix.class)
@FeignClient(value = "USER-PROVIDER")
@RequestMapping("/user")
public interface IUserService {

    @RequestMapping("/hello/{param}")
    String hello(@PathVariable("param") String param);
}
