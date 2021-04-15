package com.micah.customer.controller;

import com.micah.common.enities.Payment;
import com.micah.customer.uitls.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author m.kong
 * @Date 2021/3/31 下午5:06
 * @Version 1
 * @Description
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Resource
    private RestTemplate restTemplate;
    private static final String PAYMENT_URL = "http://localhost:8001";

    @GetMapping("/payment/insert")
    public CommonResult insertPayment(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/insert",payment,CommonResult.class);
    }

    @GetMapping("/payment/select")
    public CommonResult selectPaymentById(@RequestParam("id")long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get?id="+id,CommonResult.class);
    }

}
