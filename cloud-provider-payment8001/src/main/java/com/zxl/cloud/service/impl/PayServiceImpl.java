package com.zxl.cloud.service.impl;

import com.zxl.cloud.entities.Pay;
import com.zxl.cloud.mapper.PayMapper;
import com.zxl.cloud.service.PayService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author ZhaoXiLai
 * @Date 2024/3/10 21:51
 */
@Service
public class PayServiceImpl implements PayService {
    @Resource
    PayMapper payMapper;
    @Override
    public int add(Pay pay) {
        return payMapper.insertSelective(pay);
    }

    @Override
    public int delete(Integer id) {
        return payMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Pay pay) {
        return payMapper.updateByPrimaryKeySelective(pay);
    }

    @Override
    public Pay getById(Integer id) {
        return payMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Pay> getAll() {
        return payMapper.selectAll();
    }
}
