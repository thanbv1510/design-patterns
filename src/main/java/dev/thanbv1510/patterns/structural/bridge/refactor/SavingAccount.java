package dev.thanbv1510.patterns.structural.bridge.refactor;

public class SavingAccount implements Account {
    @Override
    public void openAccount() {
        System.out.println("saving account...");
    }
}
