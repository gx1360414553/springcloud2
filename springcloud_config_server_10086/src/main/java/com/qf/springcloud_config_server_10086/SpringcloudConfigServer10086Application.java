package com.qf.springcloud_config_server_10086;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudConfigServer10086Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigServer10086Application.class, args);
    }
}
