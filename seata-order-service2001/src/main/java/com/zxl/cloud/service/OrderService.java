package com.zxl.cloud.service;

import com.zxl.cloud.entities.Order;

/**
 * @Author ZhaoXiLai
 * @Date 2024/3/28 0:41
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);

}
