package com.zerobase.convpay.service;

import com.zerobase.convpay.dto.PayRequest;
import com.zerobase.convpay.dto.PayResponse;

public interface DiscountInterface {
    Integer getDiscountedAmount(PayRequest request);
}
