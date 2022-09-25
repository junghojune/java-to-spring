package com.zerobase.convpay.service;

import com.zerobase.convpay.dto.PayRequest;
import com.zerobase.convpay.type.ConvenienceType;
import com.zerobase.convpay.type.PayMethodType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountByConvenienceTest {
    DiscountByConvenience discountByCon = new DiscountByConvenience();

    @Test
    void discountTest(){
        //given
        PayRequest payRequestG25 =
                new PayRequest(PayMethodType.MONEY, ConvenienceType.G25, 1000);
        PayRequest payRequestGU =
                new PayRequest(PayMethodType.MONEY, ConvenienceType.GU, 1000);
        PayRequest payRequestSeven =
                new PayRequest(PayMethodType.MONEY, ConvenienceType.SEVEN, 1000);

        //when
        Integer discountedAmountG25 = discountByCon.getDiscountedAmount(payRequestG25);
        Integer discountedAmountGU = discountByCon.getDiscountedAmount(payRequestGU);
        Integer discountedAmountSeven = discountByCon.getDiscountedAmount(payRequestSeven);


        //then

        assertEquals(800, discountedAmountG25);
        assertEquals(900, discountedAmountGU);
        assertEquals(1000, discountedAmountSeven);

    }

}