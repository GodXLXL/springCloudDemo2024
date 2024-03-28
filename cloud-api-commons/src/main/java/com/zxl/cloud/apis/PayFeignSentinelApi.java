package com.zxl.cloud.apis;

import com.zxl.cloud.resp.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author ZhaoXiLai
 * @Date 2024/3/27 22:44
 */
@FeignClient(value = "nacos-payment-provider",fallback = PayFeignSentinelApiFallBack.class)
public interface PayFeignSentinelApi
{
    @GetMapping("/pay/nacos/get/{orderNo}")
    public ResultData getPayByOrderNo(@PathVariable("orderNo") String orderNo);
}
