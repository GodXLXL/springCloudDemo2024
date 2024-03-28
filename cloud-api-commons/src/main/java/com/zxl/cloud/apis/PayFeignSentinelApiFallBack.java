package com.zxl.cloud.apis;

import com.zxl.cloud.resp.ResultData;
import com.zxl.cloud.resp.ReturnCodeEnum;
import org.springframework.stereotype.Component;

/**
 * @Author ZhaoXiLai
 * @Date 2024/3/27 22:45
 */
@Component
public class PayFeignSentinelApiFallBack implements PayFeignSentinelApi
{
    @Override
    public ResultData getPayByOrderNo(String orderNo)
    {
        return ResultData.fail(ReturnCodeEnum.RC500.getCode(),"对方服务宕机或不可用，FallBack服务降级o(╥﹏╥)o");
    }
}
