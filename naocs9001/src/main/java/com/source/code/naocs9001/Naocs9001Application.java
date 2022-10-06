package com.source.code.naocs9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//nacos注册到配置中心的注解
@EnableDiscoveryClient
public class Naocs9001Application {

    public static void main(String[] args) {
        SpringApplication.run(Naocs9001Application.class, args);
    }

}
