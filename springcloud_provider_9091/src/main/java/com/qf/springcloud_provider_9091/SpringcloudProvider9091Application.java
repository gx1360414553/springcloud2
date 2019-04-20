package com.qf.springcloud_provider_9091;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudProvider9091Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProvider9091Application.class, args);
    }
}
