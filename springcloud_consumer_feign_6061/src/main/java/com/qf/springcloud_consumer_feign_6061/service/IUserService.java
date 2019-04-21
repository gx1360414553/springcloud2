package com.qf.springcloud_consumer_feign_6061.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//可以设置熔断器打开的参数
@FeignClient(value = "USER-PROVIDER",fallback = UserServiceHystrix.class)
//@FeignClient(value = "USER-PROVIDER")
//@RequestMapping("/user")使用hystrix类上面不能用requestMapping
public interface IUserService {

    @RequestMapping("/user/hello/{param}")
    String hello(@PathVariable("param") String param);
}
