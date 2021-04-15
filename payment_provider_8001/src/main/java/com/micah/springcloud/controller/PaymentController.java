package com.micah.springcloud.controller;

import com.micah.common.enities.Payment;
import com.micah.springcloud.mapper.PaymentMapper;
import com.micah.springcloud.uitls.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author m.kong
 * @Date 2021/3/30 下午9:22
 * @Version 1
 * @Description
 */
@Controller
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentMapper paymentMapper;

    @PostMapping("/insert")
    @ResponseBody
    public CommonResult insert(@RequestBody Payment payment){
        int result = paymentMapper.insert(payment);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功", result);
        } else {
            return new CommonResult(444, "插入数据失败", null);
        }
    }

    @GetMapping("/get")
    @ResponseBody
    public CommonResult getPaymentById(@RequestParam("id")long id){
        Payment payment = paymentMapper.selectById((id));
        return new CommonResult(200, payment.toString(), null);
    }

}
