package com.qf.springcloud_consumer_ribbon_6060;

import com.qf.springcloud_consumer_ribbon_6060.config.ReluConfig1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//去注册中心注册服务 发现服务
@EnableEurekaClient
//去调用服务
@EnableDiscoveryClient
//根据不同的服务设置相应的配置
@RibbonClients({
        @RibbonClient(value = "USER-PROVIDER",configuration = ReluConfig1.class)
        //@RibbonClient(value = "xxxxx",configuration = ReluConfig2.class)
})
@ComponentScan(excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = NoCompend.class )
})
//@EnableHystrix
public class SpringcloudConsumerRibbon6060Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerRibbon6060Application.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /**
     * 设置相应的负载均衡策略
     * @return
     */
//
}
