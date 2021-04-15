package com.micah.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.micah.common.enities.Payment;
import com.micah.springcloud.mapper.PaymentMapper;
import com.micah.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @Author m.kong
 * @Date 2021/3/30 下午9:22
 * @Version 1
 * @Description
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {
}
