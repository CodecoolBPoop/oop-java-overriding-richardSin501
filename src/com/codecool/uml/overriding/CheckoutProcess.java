package com.codecool.uml.overriding;

public class CheckoutProcess extends AbstractProcess {

    @Override
    public void action(Orderable item) {
        System.out.println("checkout "+item.checkout());
    }
}
