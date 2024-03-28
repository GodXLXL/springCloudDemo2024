package com.zxl.cloud.controller;

import com.zxl.cloud.entities.Order;
import com.zxl.cloud.resp.ResultData;
import com.zxl.cloud.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ZhaoXiLai
 * @Date 2024/3/28 0:47
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public ResultData create(Order order)
    {
        orderService.create(order);
        return ResultData.success(order);
    }
}
