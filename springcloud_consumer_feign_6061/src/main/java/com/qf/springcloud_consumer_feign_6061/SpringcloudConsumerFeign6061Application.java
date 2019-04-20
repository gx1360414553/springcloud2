package com.qf.springcloud_consumer_feign_6061;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringcloudConsumerFeign6061Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerFeign6061Application.class, args);
    }
}
