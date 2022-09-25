package com.zerobase.convpay.dto;

import com.zerobase.convpay.type.ConvenienceType;
import com.zerobase.convpay.type.PayMethodType;

public class PayRequest {
    // 결제 수단
    PayMethodType payMethodType;


    // 편의점 종류
    ConvenienceType convenienceType;
    // 결제 금액
    Integer payAccount;

    public PayRequest(PayMethodType payMethodType, ConvenienceType convenienceType, Integer payAccount) {
        this.convenienceType = convenienceType;
        this.payAccount = payAccount;
        this.payMethodType = payMethodType;
    }

    public Integer getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(Integer payAccount) {
        this.payAccount = payAccount;
    }

    public ConvenienceType getConvenienceType() {
        return convenienceType;
    }

    public void setConvenienceType(ConvenienceType convenienceType) {
        this.convenienceType = convenienceType;
    }



    public PayMethodType getPayMethodType() {
        return payMethodType;
    }

    public void setPayMethodType(PayMethodType payMethodType) {
        this.payMethodType = payMethodType;
    }
}
