package com.zxl.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author ZhaoXiLai
 * @Date 2024/3/25 22:07
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClient3377
{
    public static void main(String[] args)
    {
        SpringApplication.run(NacosConfigClient3377.class,args);
    }
}
