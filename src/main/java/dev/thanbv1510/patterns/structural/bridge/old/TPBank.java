package dev.thanbv1510.patterns.structural.bridge.old;

public class TPBank extends Bank {
    @Override
    public void checkingAccount() {
        System.out.println("TPBank checking account...");
    }

    @Override
    public void savingAccount() {
        System.out.println("TPBank saving account...");
    }
}
