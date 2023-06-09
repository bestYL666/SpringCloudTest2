package com.SpringCloud;

import com.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: YL
 * @Date: 2023/4/1 14:52
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-ORDER-SERVICE",configuration = MySelfRule.class)
public class OrderMain80
{
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
