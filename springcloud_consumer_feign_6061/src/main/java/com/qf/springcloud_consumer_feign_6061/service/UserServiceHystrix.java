package com.qf.springcloud_consumer_feign_6061.service;

import org.springframework.stereotype.Component;

@Component
public class UserServiceHystrix implements IUserService {

    /**
     * 这个实现方法当做fallback方法使用
     * @param param
     * @return
     */
    @Override
    public String hello(String param) {
        return "返回默认响应！！！！！！！";
    }
}
