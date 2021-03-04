package com.liuurick.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by liubin on 2021/1/4
 * json封装类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private int code;
    private String message;
    private T data;

    public CommonResult(int code, String message) {
        this(code,message,null);
    }
}
