package com.zxl.cloud.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @Author ZhaoXiLai
 * @Date 2024/3/26 22:21
 */
@Service
public class FlowLimitService
{
    @SentinelResource(value = "common")
    public void common()
    {
        System.out.println("------FlowLimitService come in");
    }
}
