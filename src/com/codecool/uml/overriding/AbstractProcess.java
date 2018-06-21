package com.codecool.uml.overriding;

public abstract class AbstractProcess {

    public void stepBefore() {
        System.out.println("step before");
    }

    public abstract void action(Orderable item);

    public void stepAfter() {
        System.out.println("step after");
    }

    public void process(Orderable item) {
        stepBefore();
        action(item);
        stepAfter();
    }
}
