package com.micah.customer.uitls;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author m.kong
 * @Date 2021/3/30 下午9:23
 * @Version 1
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommonResult<T> {
    private int code;
    private String msg;
    private Integer result;
}
