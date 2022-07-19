package dev.thanbv1510.patterns.structural.bridge.old;

public class VietComBank extends Bank {
    @Override
    public void checkingAccount() {
        System.out.println("VietComBank checking account...");
    }

    @Override
    public void savingAccount() {
        System.out.println("VietComBank saving account...");
    }
}
