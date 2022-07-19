package dev.thanbv1510.patterns.structural.bridge.refactor;

public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    public abstract void openAccount();
}
