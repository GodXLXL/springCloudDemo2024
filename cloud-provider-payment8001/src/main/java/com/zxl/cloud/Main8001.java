package com.zxl.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author ZhaoXiLai
 * @Date 2024/3/10 21:39
 */
@SpringBootApplication
@MapperScan("com.zxl.cloud.mapper") //import tk.mybatis.spring.annotation.MapperScan;
@RefreshScope // 动态刷新
public class Main8001 {
    public static void main(String[] args) {
        SpringApplication.run(Main8001.class,args);
    }
}
