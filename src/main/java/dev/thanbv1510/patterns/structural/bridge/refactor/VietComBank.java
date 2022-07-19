package dev.thanbv1510.patterns.structural.bridge.refactor;

public class VietComBank extends Bank {
    public VietComBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("VietComBank open account...");
        account.openAccount();
    }
}
