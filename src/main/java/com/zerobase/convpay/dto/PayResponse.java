package com.zerobase.convpay.dto;

import com.zerobase.convpay.type.PayResult;

public class PayResponse {
    // 결제결과
    PayResult payResult;

    // 결제 성공 금액
    Integer paidAmount;

    @Override
    public String toString() {
        return "PayResponse{" +
                "payResult=" + payResult +
                ", paidAmount=" + paidAmount +
                '}';
    }

    public PayResponse(PayResult payResult, Integer payAmount) {
        this.payResult = payResult;
        this.paidAmount = payAmount;
    }

    public PayResult getPayResult() {
        return payResult;
    }

    public void setPayResult(PayResult payResult) {
        this.payResult = payResult;
    }



    public Integer getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Integer paidAmount) {
        this.paidAmount = paidAmount;
    }


}

