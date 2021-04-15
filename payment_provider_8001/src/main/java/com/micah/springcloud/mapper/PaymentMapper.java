package com.micah.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.micah.common.enities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author m.kong
 * @Date 2021/3/30 下午9:21
 * @Version 1
 * @Description
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}
