package com.liuurick.springcloud.service;

import com.liuurick.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liubin on 2021/1/4
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id")Long id);
}
