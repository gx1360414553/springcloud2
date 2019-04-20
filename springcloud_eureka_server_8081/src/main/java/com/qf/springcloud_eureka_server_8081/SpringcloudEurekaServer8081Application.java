package com.qf.springcloud_eureka_server_8081;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaServer8081Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServer8081Application.class, args);
    }
}
