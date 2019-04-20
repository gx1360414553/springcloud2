package com.qf.springcloud_consumer_ribbon_6060.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.qf.springcloud_consumer_ribbon_6060.NoCompend;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@NoCompend
public class ReluConfig1 {
    @Bean
    public IRule getIRule(){
        return new RandomRule();
    }
}
