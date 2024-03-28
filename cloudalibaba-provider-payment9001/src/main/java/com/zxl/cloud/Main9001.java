package com.zxl.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author ZhaoXiLai
 * @Date 2024/3/25 21:13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main9001
{
    public static void main(String[] args)
    {
        SpringApplication.run(Main9001.class,args);
    }
}
