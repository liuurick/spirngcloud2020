package com.liuurick.springcloud.service.impl;

import com.liuurick.springcloud.dao.PaymentDao;
import com.liuurick.springcloud.entity.Payment;
import com.liuurick.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liubin on 2021/1/4
 */
@Service
public class PayServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
