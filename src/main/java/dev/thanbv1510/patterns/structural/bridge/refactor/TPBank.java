package dev.thanbv1510.patterns.structural.bridge.refactor;

public class TPBank extends Bank {
    public TPBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("TPBank open account...");
        account.openAccount();
    }
}
