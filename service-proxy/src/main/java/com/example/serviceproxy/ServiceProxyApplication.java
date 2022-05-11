package com.example.serviceproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProxyApplication.class, args);
    }

}
