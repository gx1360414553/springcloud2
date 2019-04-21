package com.qf.springcloud_config_client_10087;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * bootstrap.yml-系统级的配置文件
 * application.yml-用户级的配置文件
 * bootstrap.yml会先与application.yml加载,如果有相同的配置application.yml会覆盖bootstrap.yml
 */
@SpringBootApplication
public class SpringcloudConfigClient10087Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigClient10087Application.class, args);
    }
}
