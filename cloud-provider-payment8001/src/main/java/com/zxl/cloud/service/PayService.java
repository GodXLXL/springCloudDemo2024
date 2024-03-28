package com.zxl.cloud.service;

import com.zxl.cloud.entities.Pay;

import java.util.List;

/**
 * @Author ZhaoXiLai
 * @Date 2024/3/10 21:49
 */
public interface PayService {
    public int add(Pay pay);
    public int delete(Integer id);
    public int update(Pay pay);

    public Pay   getById(Integer id);
    public List<Pay> getAll();
}
