package com.zerobase.convpay.service;

import com.zerobase.convpay.type.*;

public class MoneyAdapter implements PaymentInterface{
    public MoneyUseResult use(Integer payAmount){
        System.out.println("MoneyAdapter.use:" + payAmount);

        if(payAmount > 1000_000){
            return MoneyUseResult.USE_FAIL;
        }
        return MoneyUseResult.USE_SUCCESS;
    }

    public MoneyUseCancelResult useCancel(Integer payCancelAmount){
        System.out.println("MoneyAdapter.useCancel:" + payCancelAmount);

        if(payCancelAmount < 100){
            return MoneyUseCancelResult.MONEY_USE_CANCEL_FAIL;
        }
        return MoneyUseCancelResult.MONEY_USE_CANCEL_SUCCESS;
    }

    @Override
    public PaymentResult payment(Integer payAmount) {
        MoneyUseResult moneyUseResult = use(payAmount);

        if(moneyUseResult == MoneyUseResult.USE_FAIL){
            return PaymentResult.PAYMENT_FAIL;
        }

        return PaymentResult.PAYMENT_SUCCESS;
    }

    @Override
    public CancelPaymentResult cancelPayment(Integer cancelAmount) {
        MoneyUseCancelResult moneyUseCancelResult = useCancel(cancelAmount);

        if(moneyUseCancelResult == MoneyUseCancelResult.MONEY_USE_CANCEL_FAIL){
            return CancelPaymentResult.CANCEL_PAYMENT_FAIL;
        }

        return CancelPaymentResult.CANCEL_PAYMENT_SUCCESS;
    }
}
