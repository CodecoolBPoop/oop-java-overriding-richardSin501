package com.codecool.uml.overriding;

public class PaymentProcess extends AbstractProcess {

    @Override
    public void action(Orderable item) {
        System.out.println("payment " + item.pay());
    }
}
