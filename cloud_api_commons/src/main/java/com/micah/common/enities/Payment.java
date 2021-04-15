package com.micah.common.enities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author m.kong
 * @Date 2021/3/30 下午9:23
 * @Version 1
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private String serial;
}
